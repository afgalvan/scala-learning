package prelude

import java.util.concurrent.atomic.AtomicInteger
import scala.util.Random

object ControlStructures extends App {
  val random = new Random()

  println("- If statement")
  println(ifStatement())
  println(ternaryOperator())

  println("\n- Match statement")
  println(matchOperator(random.nextInt(5)))
  println(getClassAsString(5))

  println("\n- Try catch")
  println(tryCatch())

  // ------ Loops --------
  println("\n\n-- LOOPS --")
  println("\n- for loop")
  println(forLoop())
  println("\n- do while")
  println(doWhileLoop())

  // Traditional if
  def ifStatement(): String = {

    if (random.nextBoolean()) {
      "True"
    } else if (random.nextInt() % 2 == 0) {
      "Even number generated"
    } else {
      "Else statement reached"
    }
  }

  // Ternary operator
  def ternaryOperator(): String = if (random.nextInt() > 0) "Positive number generated" else "Negative number generated"

  // Match operator
  def matchOperator(number: Int): String = number match {
    case 1 => "First case"
    case 2 => "Second case"
    case 3 => "Third case"
    case _ => "Unknown case"
  }

  def getClassAsString(x: Any): String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case _ => "Unknown"
  }

  // Try catch
  def division(divisor: Double, dividend: Double): Double = if (dividend == 0) throw new Exception("0 division") else divisor / dividend

  def tryCatch(): Double = {
    try {
      division(random.between(2, 8), random.between(0, 1))
    } catch {
      case _: Exception => 0.0
    }
  }


  // for loop
  def forLoop(): IndexedSeq[Int] = {
    for (arg <- args) println(arg)

    // "x to y" syntax
    for (i <- 0 to 5) println(i)

    // "x to y by" syntax
    for (i <- 0 to 10 by 2) println(i)

    for (i <- 1 to 5) yield i * 2
  }

  def doWhileLoop(): String = {
    val counter = new AtomicInteger(1)

    do {
      counter.getAndIncrement()
    } while (random.nextBoolean())

    f"$counter Iterations"
  }
}
