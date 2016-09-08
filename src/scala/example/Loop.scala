package scala.example

import java.util.ArrayList
import scala.example.Test

object Loop {

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
      
    // variable
    var c:Int=1;
    c=2;
    val b:Int=1;
    
    var s="aaaa";
    
    
    var dstring="""ddddfadfa
       dadfa  df
      cadcadc
      dacad
      xxx
      dadca
      cdacb|dadad
      cadca
      ###"""
    val dd=new Test2()
    dd.aa()
  }

}