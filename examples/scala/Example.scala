import scala.concurrent.duration.SECONDS

// Type Alias
type Age = Int

/**
 * A Person
 * @name The person's name
 * @age The person's age
 */
final case class Person(name: String, age: Age) {
  // Higher-order function
  def modifyName(f: String => String): Person = this.copy(name = f(name))
}

object Person {
  def createPerson(name: String, age: String): Either[String, Person] = {
    // for-comp
    for {
      validName <- validateName(name)
      validAge  <- validateAge(age)
    } yield Person(validName, validAge)
  }

  def validateName(name: String): Either[String, String] = ???
  def validateAge(age: String): Either[String, Age] = {
    try {
      Right(age.toInt)
    } catch {
      case e:NumberFormatException => Left(s"${age} is not a number")
    }
  }

  def getAge(age: String): Int =
    try {
      age.toInt
    } catch {
      case e: Exception => throw e
    }
}

// Enum
sealed trait EmployeeType

object EmployeeType {
  case object Developer extends EmployeeType
  case object TechLead  extends EmployeeType
  case object Manager   extends EmployeeType

  // Val
  val employeeTypes: List[EmployeeType] = List(Developer, TechLead, Manager)

  def show(employeeType: EmployeeType): String = employeeType match {
    // Patten matching
    case Developer => "Dev"
    case TechLead  => "TecL"
    case Manager   => "Manager"
  }
}

abstract class Occupation {

  // Var
  var usafeIdentity: Long

  // Function without arguments
  def name(): String

  // Function with arguments
  def pay(employeeType: EmployeeType, tax: Double): Double

  // Undesirable type
  def sideEffect(): Unit

  // implicit
  implicit def show(oc: Occupation): String = ???
}

// Generics
final class Box[T[_], A](value: T[A]) {
  def add(item: A): Box[T, A] = ???
}

