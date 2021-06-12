package chapter_00_prelude

import java.util.concurrent.atomic.AtomicInteger
import scala.collection.mutable.ArrayBuffer

object Classes extends App {

  class Person(var firstName: String, var lastName: String) {
    override def toString: String = s"$firstName $lastName"
  }

  val person = new Person("Julia", "Kern")
  println(person)
  person.lastName = "Manes"
  println(person)

  // Composition ------------------------
  class CrustSize
  class CrustType
  class Topping { override def toString: String = "Topping" }

  class Pizza(
      var crustSize: CrustSize,
      var crustType: CrustType,
      val toppings: ArrayBuffer[Topping]
  ) {
    def addTopping(t: Topping): Unit    = toppings += t
    def removeTopping(t: Topping): Unit = toppings -= t
    def removeAllToppings(): Unit       = toppings.clear()
  }

  def topping: Topping     = new Topping
  def crustSize: CrustSize = new CrustSize
  def crustType: CrustType = new CrustType

  val toppings = ArrayBuffer(topping, topping, topping)
  val pizza    = new Pizza(crustSize, crustType, toppings)
  pizza.addTopping(topping)

  val toppingCount = new AtomicInteger(1)
  pizza.toppings.foreach(t => println(s"$t ${toppingCount.getAndIncrement()}"))
}
