
import scala.util.matching.Regex



object Token extends Enumeration {
  val START, WHITESPACES, NUMBER, OPEN, CLOSE, OR, AND, XOR, NOT, TRUE, FALSE, PLUS, MUL, MINUS, EXP, COS, SIN, EPSILON, EOF = Value
}

class CalculatorLexer(private val input: String) {
  import Token._

  private val name2regexp: Map[Token.Value, Regex] = Map(
    NUMBER -> "\\d+(\\.\\d+)?".r,
    OPEN -> "\\(".r,
    CLOSE -> "\\)".r,
    OR -> "\\|".r,
    AND -> "&".r,
    XOR -> "\\^".r,
    NOT -> "!".r,
    TRUE -> "true".r,
    FALSE -> "false".r,
    PLUS -> "\\+".r,
    MUL -> "\\*".r,
    MINUS -> "-".r,
    EXP -> "exp".r,
    COS -> "cos".r,
    SIN -> "sin".r
  )
  private var text = input
  private val ignorePattern = "([\\n\\r\\t ]+)".r

  var curTokenContext: TokenContext = TokenContext(START, "")

  def nextToken(): Unit = {
    val ignoredCount = ignorePattern.findPrefixMatchOf(text) match {
      case None => 0
      case Some(x) => x.end
    }

    text = text.substring(ignoredCount)

    val suitableToken = name2regexp.map {
      case (t, p) => (t, p.findPrefixMatchOf(text))
    }.find { case (_, m) => m.isDefined }

    suitableToken match {
      case None => {
        curTokenContext = TokenContext(EOF, "")
      }
      case Some(token -> Some(m)) => {
        text = text.substring(m.end)
        curTokenContext = TokenContext(token, m.toString)
      }
    }
  }

  case class TokenContext(token: Token.Value, text: String)

}

