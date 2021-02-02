import MetaGrammarParser.CodeContext

object FormatUtils {
  implicit def formatCode(codeCtx: CodeContext): String = {
    Option(codeCtx) match {
      case None => ""
      case Some(ctx) => ctx
        .getText
        .filter(c => c != '{' && c != '}')
        .split(System.lineSeparator)
        .map(_.strip())
        .mkString(System.lineSeparator)
    }
  }

  def removeParenthesis(s: String): String = s.filter(c => c != '(' && c != ')')

  def escape(s: String): String = s.replace("""\""", """\\""")
}
