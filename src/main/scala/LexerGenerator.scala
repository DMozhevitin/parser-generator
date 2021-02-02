import java.io.{File, PrintWriter}
import java.nio.file.{Path, Paths}

import FormatUtils.escape

import scala.util.Using

class LexerGenerator(private val grammar: Grammar) {

  private def generateTokensEnum(): String = {
    val terminals = grammar.rules
      .collect { case t: Terminal => t }
      .map(_.name)

    s"""
       |${grammar.header}
       |
       |object Token extends Enumeration {
       |  val START, ${terminals.mkString(", ")}, EOF = Value
       |}
       |""".stripMargin
  }


  def generateLexer(): Unit = {

    val ignore: Set[Terminal] = grammar.terminals
      .filter(_.ignore)
      .toSet

    val tokens: List[Terminal] = grammar.terminals
      .filterNot(rule => ignore.contains(rule))

    val ignorePattern = ignore
      .map(rule => {
        val len = rule.pattern.length
        val shrinked = rule.pattern.substring(1, len - 1)
        "(" + escape(shrinked) + ")"
      }).mkString("|")

    val lexerName = s"${grammar.name}Lexer"
    val path = Paths.get("").resolve(s"gen/$lexerName.scala")

    val sourceCode = s"""
       |import scala.util.matching.Regex
       |${generateTokensEnum()}
       |class ${grammar.name}Lexer(private val input: String) {
       |  import Token._
       |
       |  private val name2regexp: Map[Token.Value, Regex] = Map(
       |    ${tokens.filter(_.name != "EPSILON").map(token => s"${token.name} -> ${escape(token.pattern)}.r").mkString(",\n    ")}
       |  )
       |  private var text = input
       |  private val ignorePattern = "$ignorePattern".r
       |
       |  var curTokenContext: TokenContext = TokenContext(START, "")
       |
       |  def nextToken(): Unit = {
       |    val ignoredCount = ignorePattern.findPrefixMatchOf(text) match {
       |      case None => 0
       |      case Some(x) => x.end
       |    }
       |
       |    text = text.substring(ignoredCount)
       |
       |    val suitableToken = name2regexp.map {
       |      case (t, p) => (t, p.findPrefixMatchOf(text))
       |    }.find { case (_, m) => m.isDefined }
       |
       |    suitableToken match {
       |      case None => {
       |        curTokenContext = TokenContext(EOF, "")
       |      }
       |      case Some(token -> Some(m)) => {
       |        text = text.substring(m.end)
       |        curTokenContext = TokenContext(token, m.toString)
       |      }
       |    }
       |  }
       |
       |  case class TokenContext(token: Token.Value, text: String)
       |
       |}
       |""".stripMargin

    FileUtils.writeGeneratedSource(lexerName, sourceCode)
  }
}
