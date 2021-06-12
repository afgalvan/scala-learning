package prelude

object Classes extends App {

  class Person(var firstName: String, var lastName: String) {
    override def toString: String = s"$firstName $lastName"
  }

  val person = new Person("Julia", "Kern")
  println(person.firstName)
  person.lastName = "Manes"
  println(person)

}
