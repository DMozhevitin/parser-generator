import scala.collection.mutable

package object Types {

  sealed trait AttributeType {
    def defaultValue(): String
    def name: String
  }

  object AttributeType {
    def valueOf(str: String): Option[AttributeType] = {
      str match {
        case "Int" => Some(IntType)
        case "Char" => Some(CharType)
        case "Long" => Some(LongType)
        case "String" => Some(StringType)
        case "Boolean" => Some(BooleanType)
        case "Double" => Some(DoubleType)
        case _ => None
      }
    }
  }

  case object IntType extends AttributeType {
    override def defaultValue() = "0"
    override def name: String = "Int"
  }

  case object CharType extends AttributeType {
    override def defaultValue() = "0"
    override def name: String = "Char"
  }

  case object LongType extends AttributeType {
    override def defaultValue() = "0L"
    override def name: String = "Long"
  }

  case object StringType extends AttributeType {
    override def defaultValue(): String = "\"\""
    override def name: String = "String"
  }

  case object BooleanType extends AttributeType {
    override def defaultValue(): String = "false"
    override def name: String = "Boolean"
  }

  case object DoubleType extends AttributeType {
    override def defaultValue(): String = "0D"
    override def name: String = "Double"
  }

  type AttributeName = String
  type Code = String
  type RuleName = String

  type Follow = mutable.Map[String, mutable.Set[String]]
}
