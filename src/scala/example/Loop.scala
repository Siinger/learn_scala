package scala.example

import java.util.ArrayList

object Basic {

  def main(args: Array[String]) {

    // for    
    for (i <- 1 to 3) {
      println("for to : " + i);
    }
    // 去掉上界
    for (i <- 1 until 3) {
      println("for until : " + i);
    }
    // foreach
    (1 to 3).foreach(i => println("foreach : " + i))

    // 枚举
    for (i <- 1 to 3; j <- 1 to 3) {
      println("loop : " + i + " " + j);
    }

    //while
    var a = 1
    while (a < 3) {
      a = a + 1;
    }

    // do while
    do {
      a = a + 1;
    } while (a < 6)

  }

}