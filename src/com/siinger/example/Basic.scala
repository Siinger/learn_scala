package com.siinger.example

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
    (1 to 3).foreach(i => print("foreach : " + i))

    //variable
    
    val capacity : Int = 10
    val list = new ArrayList[String]
    list.ensureCapacity(capacity);

  }

}