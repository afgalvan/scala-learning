package chapter_00_prelude

/**
  * Tuples let you put a heterogeneous collection of elements in a little container.
  * A tuple can contain between two and 22 values, and  all of the values  can  have
  * different types.
  */
object Tuples extends App {

  /*
   * For example, this is a tuple that holds three different types,
   * an Int, a Double, and a String.
   */
  class Eleven { override def toString: String = this.getClass.getSimpleName }

  val sample = (11, 11.0, "Eleven", new Eleven)

  println(sample)
  println(f"Tuple indexing by sample._1 ${sample._1}")

  def getSillyInfo: (String, BigDecimal, Long) = ("AAPL", BigDecimal(123.45), 101202303L)
  // Extract tuple values using pattern matching.
  val (symbol, price, volume) = getSillyInfo
  println(f"symbol: $symbol")
  println(f"price: $price")
  println(f"volume: $volume")
}
