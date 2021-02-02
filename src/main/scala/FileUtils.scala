import java.io.PrintWriter
import java.nio.file.{Files, Paths}

object FileUtils {
  private val DIR_NAME = "gen"
  private val DIR_PATH = Paths.get("").resolve(s"$DIR_NAME")

  def writeGeneratedSource(className: String, sourceCode: String): Unit = {
    if (!Files.exists(DIR_PATH)) {
      Files.createDirectories(DIR_PATH)
    }
    val path = DIR_PATH.resolve(s"$className.scala")
    val writer = new PrintWriter(path.toFile)
    try {
      writer.println(sourceCode)
    } finally {
      writer.close()
    }
  }
}
