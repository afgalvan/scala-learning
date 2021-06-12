package chapter_00_prelude

import scala.math.pow

object Collections extends App {

  implicit class PowerInt(val i: Double) extends AnyVal {
    def **(exp: Double): Double = pow(i, exp)
  }

  // Populate lists
  val numList     = List.range(0, 10)
  val evenNumbers = (2 to 10 by 2).toList
  val alphabet    = ('a' to 'z').toList
  val names       = List("joel", "ed", "chris", "maurice")

  println("Lists")
  println(numList)
  println(evenNumbers)
  println(alphabet)
  println(names)

  // Collection's methods
  // 1. foreach
  println("\n1. foreach")
  // 1.1. Traditional for
  // for (name <- names) println(name)
  // 1.2. foreach approach
  //names.foreach(name => println(name))
  // 1.3. method reference foreach
  names.foreach(println)
  // 1.4. dotless or Arity-1 foreach, avoid for non-pure functions
  // names foreach println

  // 2. filter
  println("\n2. filter")
  // normal filter
  // numList.filter(n => n < 4).foreach(println)
  numList.filter(_ < 4).foreach(println) // "_" means a ignorable variable

  // 3. map
  println("\n3. map")
  evenNumbers.map(_ ** 2).foreach(println)
  names.map(_.capitalize).foreach(println)

  // 4. fold, foldLeft & foldRight
  println("\n4. fold")
  println(evenNumbers.fold(0)(_ + _)) // .sum
  println(names.foldLeft("")(_ + ", " + _)) // ", joel, ed, chris, maurice"
  println(names.foldRight("")(_ + ", " + _)) // "joel, ed, chris, maurice,"
}
