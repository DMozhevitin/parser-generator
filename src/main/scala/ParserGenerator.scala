import Types.{AttributeName, AttributeType}
import Constants._

import scala.collection.mutable

class ParserGenerator(val grammar: Grammar) {

  def generateParser(): Unit = {
    val className = s"${grammar.name}Parser"
    val lexerName = s"${grammar.name}Lexer"

    val nonTermNames = grammar.nonTerminals.map(_.name).toSet
    val sourceCode = s"""
       |class $className(private val lexer: $lexerName) {
       |  import Token._
       |  import scala.collection.mutable.ArrayBuffer
       |
       |  lexer.nextToken()
       |
       |${generateParseFunction()}
       |${nonTermNames.map(generateASTNode).mkString(SEP)}
       |${generateASTNodeClass()}
       |${generateConsumeFunction()}
       |${generateParseExceptionClass()}
       |
       |}
       |""".stripMargin

    FileUtils.writeGeneratedSource(className, sourceCode)
  }

  private def generateConsumeFunction(): String = {
    """
      |  def consume(expectedToken: Token.Value): Unit = {
      |    val actualToken = lexer.curTokenContext.token
      |    if (expectedToken != actualToken) {
      |      throw ParseException(s"Expected $expectedToken, found $actualToken.")
      |    }
      |    lexer.nextToken()
      |  }
      |""".stripMargin
  }

  private def generateCaseBlockBody(rule: NonTerminal, nonTermNames: Set[String]): String = {
    rule.productions.map { case (name, code) => {
      if (nonTermNames.contains(name)) {
        s"""
           |        val $name = node${name.capitalize}($code)
           |        res.children += $name
           |""".stripMargin
      } else {
        s"""
           |        val $name = Node("$name")
           |        res.children += $name
           |        consume(Token.$name)
           |""".stripMargin
      }
    }
    }.filterNot(_.isBlank).mkString(s"$SEP        ") + s"$SEP        ${rule.code}\n"
  }

  private def argToString(arg: Option[(AttributeName, AttributeType)]): String = {
    arg match {
      case None => ""
      case Some((n, t)) => s"$n: ${t.name}"
    }
  }

  private def generateASTNode(name: String): String = {
    val alphas = grammar.rules.filter(_.name == name)
    val alpha2First = mutable.Map[String, GrammarRule]()

    val nonTerminals = grammar.nonTerminals
    val nonTermNames = nonTerminals.map(_.name).toSet

    val rule = nonTerminals.filter(_.name == name) match {
      case r :: _ => r
    }

    val defaultCode = alphas.collect { case x: NonTerminal => x }
      .find(_.productions.map(_._1).contains(EPSILON)) match {
      case None => ""
      case Some(r) => r.code
    }

    val follow = if (grammar.first.nonTerminals(name) contains EPSILON)
      grammar.follow(name)
    else
      mutable.Set[String]()

    alphas.foreach {
      case Terminal(name, _, _, _) => alpha2First(name)
      case nt@NonTerminal(_, _, _, productions) => grammar.first.alternatives(productions.map(_._1).mkString(" "))
        .filter(r => r != EPSILON)
        .foreach(alpha2First(_) = nt)
    }

    s"""
       |  private def node${rule.name.capitalize}(${argToString(rule.arg)}): Node = {
       |    val res = Node("${rule.name}")
       |    val context = lexer.curTokenContext
       |    context.token match {
       |      ${alpha2First.map { case (k, v) => s"case $k => {      ${generateCaseBlockBody(
      v.asInstanceOf[NonTerminal], nonTermNames)}" }.mkString(s"    }$SEP$SEP    ") + s"$SEP    }"}
       |
       |      ${follow.map(r => s"case $r => $defaultCode").mkString(s"$SEP    ")}
       |      case _ => throw ParseException("Unexpected token " + context.text)
       |    }
       |    res
       |  }
       |""".stripMargin
  }


  private def generateASTNodeClass(): String = {
    s"""
       |  case class Node(name: String) {
       |    val children: ArrayBuffer[Node] = ArrayBuffer()
       |    ${grammar.attrs.map { case (n, t) => s"var $n: ${t.name} = ${t.defaultValue()}"}.mkString(SEP) }
       |  }
       |""".stripMargin
  }

  private def generateParseFunction(): String = {
    s"""
       |  def parse(): Node = node${grammar.rules.head.name.capitalize}()
       |""".stripMargin
  }

  private def generateParseExceptionClass(): String = {
    """  case class ParseException(private val message: String = "") extends Exception(message)"""
  }

}
