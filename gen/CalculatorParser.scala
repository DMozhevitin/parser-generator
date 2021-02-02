
class CalculatorParser(private val lexer: CalculatorLexer) {
  import Token._
  import scala.collection.mutable.ArrayBuffer

  lexer.nextToken()


  def parse(): Node = nodeAddExp()


  private def nodeNegExp(): Node = {
    val res = Node("negExp")
    val context = lexer.curTokenContext
    context.token match {
      case NUMBER => {      
        val NUMBER = Node("NUMBER")
        res.children += NUMBER
        consume(Token.NUMBER)

        res.value = context.text.toInt
    }

    case OPEN => {      
        val OPEN = Node("OPEN")
        res.children += OPEN
        consume(Token.OPEN)

        
        val addExp = nodeAddExp()
        res.children += addExp

        
        val CLOSE = Node("CLOSE")
        res.children += CLOSE
        consume(Token.CLOSE)

        res.value = addExp.value
    }

    case MINUS => {      
        val MINUS = Node("MINUS")
        res.children += MINUS
        consume(Token.MINUS)

        
        val negExp = nodeNegExp()
        res.children += negExp

        res.value = -negExp.value

    }

      
      case _ => throw ParseException("Unexpected token " + context.text)
    }
    res
  }


  private def nodeMulExpTail(acc: Int): Node = {
    val res = Node("mulExpTail")
    val context = lexer.curTokenContext
    context.token match {
      case MUL => {      
        val MUL = Node("MUL")
        res.children += MUL
        consume(Token.MUL)

        
        val negExp = nodeNegExp()
        res.children += negExp

        
        val mulExpTail = nodeMulExpTail(acc * negExp.value)
        res.children += mulExpTail

        res.value = mulExpTail.value

    }

      case EOF => res.value = acc
    case PLUS => res.value = acc
    case CLOSE => res.value = acc
      case _ => throw ParseException("Unexpected token " + context.text)
    }
    res
  }


  private def nodeAddExp(): Node = {
    val res = Node("addExp")
    val context = lexer.curTokenContext
    context.token match {
      case NUMBER => {      
        val mulExp = nodeMulExp()
        res.children += mulExp

        
        val addExpTail = nodeAddExpTail(mulExp.value)
        res.children += addExpTail

        res.value = addExpTail.value
    }

    case OPEN => {      
        val mulExp = nodeMulExp()
        res.children += mulExp

        
        val addExpTail = nodeAddExpTail(mulExp.value)
        res.children += addExpTail

        res.value = addExpTail.value
    }

    case MINUS => {      
        val mulExp = nodeMulExp()
        res.children += mulExp

        
        val addExpTail = nodeAddExpTail(mulExp.value)
        res.children += addExpTail

        res.value = addExpTail.value

    }

      
      case _ => throw ParseException("Unexpected token " + context.text)
    }
    res
  }


  private def nodeMulExp(): Node = {
    val res = Node("mulExp")
    val context = lexer.curTokenContext
    context.token match {
      case NUMBER => {      
        val negExp = nodeNegExp()
        res.children += negExp

        
        val mulExpTail = nodeMulExpTail(negExp.value)
        res.children += mulExpTail

        res.value = mulExpTail.value
    }

    case OPEN => {      
        val negExp = nodeNegExp()
        res.children += negExp

        
        val mulExpTail = nodeMulExpTail(negExp.value)
        res.children += mulExpTail

        res.value = mulExpTail.value
    }

    case MINUS => {      
        val negExp = nodeNegExp()
        res.children += negExp

        
        val mulExpTail = nodeMulExpTail(negExp.value)
        res.children += mulExpTail

        res.value = mulExpTail.value

    }

      
      case _ => throw ParseException("Unexpected token " + context.text)
    }
    res
  }


  private def nodeAddExpTail(acc: Int): Node = {
    val res = Node("addExpTail")
    val context = lexer.curTokenContext
    context.token match {
      case PLUS => {      
        val PLUS = Node("PLUS")
        res.children += PLUS
        consume(Token.PLUS)

        
        val mulExp = nodeMulExp()
        res.children += mulExp

        
        val addExpTail = nodeAddExpTail(acc + mulExp.value)
        res.children += addExpTail

        res.value = addExpTail.value

    }

      case EOF => res.value = acc
    case CLOSE => res.value = acc
      case _ => throw ParseException("Unexpected token " + context.text)
    }
    res
  }


  case class Node(name: String) {
    val children: ArrayBuffer[Node] = ArrayBuffer()
    var value: Int = 0
  }


  def consume(expectedToken: Token.Value): Unit = {
    val actualToken = lexer.curTokenContext.token
    if (expectedToken != actualToken) {
      throw ParseException(s"Expected $expectedToken, found $actualToken.")
    }
    lexer.nextToken()
  }

  case class ParseException(private val message: String = "") extends Exception(message)

}

