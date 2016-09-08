package scala.chapter1

object Chapter1 {

  def numDetect(num: Int): Int = if (num > 0) 1 else if (num < 0) -1 else 0

  def main(args: Array[String]): Unit = {

    var i = 10
    while (i >= 0) {
      println(i)
      i = i - 1
    }

    println(charMultiply("main"));
    println(charMultiply2("main"));
  }
  def charMultiply(str: String): Long = {
    var sum: Long = 1
    for (i <- 0 to str.length()) {
      sum *= str.indexOf(i)
    }
    return sum;
  }
  def charMultiply2(str: String): Long = {
    var sum: Long = 1
    for (i <- str) {
      sum *= i
    }
    return sum;
  }

}