import java.nio.file.Path

import Constants.{EMPTY, EOF, EPSILON}
import FormatUtils.{formatCode, removeParenthesis}
import MetaGrammarParser._

import scala.jdk.CollectionConverters._
import scala.collection.immutable.List
import scala.collection.mutable
import Types._
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.antlr.v4.runtime.tree.ParseTreeWalker

import scala.collection.mutable.ArrayBuffer

sealed class GrammarRule(val name: RuleName, val code: Code)

case class Terminal(override val name: RuleName,
                    override val code: Code,
                    pattern: String,
                    ignore: Boolean) extends GrammarRule(name, code)

case class NonTerminal(override val name: RuleName,
                       override val code: Code,
                       arg: Option[(String, AttributeType)],
                       productions: List[(RuleName, Code)]) extends GrammarRule(name, code)

class Grammar private(val name: RuleName,
                      val header: String,
                      val rules: List[GrammarRule],
                      val attrs: mutable.Set[(AttributeName, AttributeType)]) {

  lazy val terminals: List[Terminal] = {
    rules.collect { case x: Terminal => x }
  }

  lazy val nonTerminals: List[NonTerminal] = {
    rules.collect { case x: NonTerminal => x }
  }

  lazy val first: First = {
      @scala.annotation.tailrec
      def buildFirstRecursively(first: First): First = {
        var changed = false

        rules.foreach(rule => {
          val cur = mutable.Set[String]()

          first.nonTerminals(rule.name).foreach(cur.add)
          first.addRule(rule)

          if (first.nonTerminals(rule.name) != cur) {
            changed = true
          }
        })

        if (changed)
          buildFirstRecursively(first)
        else
          first

      }

      buildFirstRecursively(First.empty(this))
  }

  lazy val follow: Follow = {
    val nonTermNames: Set[RuleName] = nonTerminals.map(_.name).toSet

    @scala.annotation.tailrec
    def buildFollowRecursively(follow: Follow): Follow = {
      var changed = false

      for {
        nonTerminal <- nonTerminals
        ((name, _), i) <- nonTerminal.productions.zipWithIndex
        if nonTermNames.contains(name)
      } {
        val gamma = if (i == nonTerminal.productions.length - 1)
          EPSILON
        else
          nonTerminal.productions(i + 1)._1

        val cur = mutable.Set[String]()
        follow(name).foreach(cur.add)
        follow(name).addAll(first.nonTerminals(gamma).diff(Set(EPSILON)))

        if (first.nonTerminals(gamma).contains(EPSILON)) {
          follow(name).addAll(follow(nonTerminal.name))
        }

        if (follow(name) != cur) {
          changed = true
        }
      }

      if (changed)
        buildFollowRecursively(follow)
      else
        follow
    }

    buildFollowRecursively(Follow.empty(this))
  }
}

object Grammar {

  def apply(path: Path): Grammar = GrammarBuilder.build(path)

  private class GrammarBuilder extends MetaGrammarBaseListener {

    private val rules = ArrayBuffer[GrammarRule]()
    private val attrs = mutable.Set[(AttributeName, AttributeType)]()

    override def exitTerminalRule(ctx: TerminalRuleContext): Unit = {
      rules += Terminal(
        ctx.TOKEN_NAME().getText,
        ctx.code,
        ctx.REGEX().getText,
        ctx.SKIP_RULE() != null
      )
    }

    override def exitNonTerminalRule(ctx: NonTerminalRuleContext): Unit = {
      val name = ctx.IDENTIFIER().getText
      val arg = Option(ctx.attr()).map(mkField)

      rules.addAll(ctx.alternative().asScala
        .toList.map(mkRule(name, arg)))
    }

    override def exitAttrs(ctx: AttrsContext): Unit = {
      attrs.addAll(Option(ctx) match {
        case None => Set()
        case Some(x) => x
          .attr()
          .asScala
          .toList
          .map(mkField)
      })
    }

    def mkRule(name: RuleName, arg: Option[(AttributeName, AttributeType)])
              (alternativeContext: AlternativeContext): GrammarRule = {
      val code = Option(alternativeContext.code())
        .map(formatCode)
      match {
        case None => EMPTY
        case Some(x) => x
      }

      val names: List[ProductionContext] = alternativeContext.production()
        .asScala
        .toList

      val productions = names.map { n =>
        val passedArgument = Option(n.inheritedAttr())
          .map(_.EXPR_IN_PARENTHESIS().getText)
        match {
          case None => EMPTY
          case Some(x) => removeParenthesis(x).strip()
        }

        val identifier = Option(n.IDENTIFIER()).map(_.getText) match {
          case None => n.TOKEN_NAME().getText
          case Some(x) => x
        }

        (identifier, passedArgument)
      }

      NonTerminal(name, code, arg, productions)
    }

    private def mkField(fieldCtx: AttrContext): (String, AttributeType) = {
      val _type = AttributeType.valueOf(fieldCtx.IDENTIFIER(1).getText) match {
        case Some(x) => x
        case None    => throw new RuntimeException("Illegal argument type.")
      }

      (fieldCtx.IDENTIFIER(0).getText, _type)
    }
  }

  private object GrammarBuilder {
    def build(path: Path): Grammar = {
      val lexer = new MetaGrammarLexer(CharStreams.fromPath(path))
      val parser = new MetaGrammarParser(new CommonTokenStream(lexer))

      val ast = parser.metaGrammar()
      val listener = new GrammarBuilder()
      val walker = new ParseTreeWalker()

      val headerCode = Option(ast.header()) match {
        case None => EMPTY
        case Some(x) => formatCode(x.code)
      }

      walker.walk(listener, ast)

      new Grammar(
        ast.grammarName().IDENTIFIER().getText,
        headerCode,
        listener.rules.toList :+ Terminal(EPSILON, EMPTY, EMPTY, ignore = false),
        listener.attrs
      )
    }

  }
}

case class First(nonTerminals: mutable.HashMap[String, mutable.Set[String]],
                 alternatives: mutable.HashMap[String, mutable.Set[String]]) {

  def addRule(rule: GrammarRule): Unit = {
    rule match {
      case t@Terminal(_, _, _, _) =>
        nonTerminals(rule.name).add(rule.name)
        alternatives(rule.name).add(rule.name)
      case NonTerminal(name, _, _, productions@(productionName, _) :: _) =>
        val rightPartOfRule = productions.map(_._1).mkString(" ")

        nonTerminals(name).addAll(nonTerminals(productionName))
        alternatives(rightPartOfRule).addAll(nonTerminals(productionName))

        for {
          (productionName, _) <- productions.init
          if nonTerminals(productionName).contains(EPSILON)
        } {
          nonTerminals(name).addAll(nonTerminals(productionName))
          alternatives(rightPartOfRule).addAll(nonTerminals(productionName))
        }
    }
  }
}

object First {
  def empty(grammar: Grammar): First = {
    val nonTerminals = mutable.HashMap[String, mutable.Set[String]]()
    val alternatives = mutable.HashMap[String, mutable.Set[String]]()

    grammar.rules.foreach(r => {
      nonTerminals(r.name) = mutable.Set()
      val key: String =
        r match {
          case _: Terminal => r.name
          case y: NonTerminal => y.productions.map(_._1).mkString(" ")
        }

      alternatives(key) = mutable.Set()
    })

    First(nonTerminals, alternatives)
  }
}

object Follow {
  def empty(grammar: Grammar): Follow = {
    val follow: Follow = grammar.rules
      .map(_.name)
      .zip(grammar.rules.indices
        .map(_ => mutable.Set[String]()))
      .to(mutable.Map)

    val start = grammar.rules.head.name
    follow(start).add(EOF)

    follow
  }
}