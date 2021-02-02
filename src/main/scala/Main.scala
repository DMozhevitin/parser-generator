import java.io.{FileNotFoundException, IOException}
import java.nio.file.Paths

object Main extends App {
  try {
    if (args.length == 1 || args(0) != null) {
      val filename = args(0)
      val grammarPath = Paths.get("").resolve(s"input/$filename")
      val grammar = Grammar(grammarPath)
      val lexerGenerator = new LexerGenerator(grammar)
      val parserGenerator = new ParserGenerator(grammar)

      lexerGenerator.generateLexer()
      parserGenerator.generateParser()
    } else {
      Console.err.println("Wrong arguments format. File with grammar expected.")
    }
  } catch {
    case _: FileNotFoundException => Console.err.println("Input file not found.")
    case ioe: IOException => Console.err.println(s"An I/O error occurred: ${ioe.getMessage}")
    case e: Exception => Console.err.println(e.getMessage)
  }
}