package com.scala.deepu

object Collection_Ex {
  def main(args: Array[String]): Unit = {
    val numbers = Array(1,2,4,5,6,7,7,8,9)
    println(numbers(5))
    val abc = List(1,2,4,5,6,7,8)
    println(abc(3))
    val snum = Set(4,56,3,5,7,2)
    println(snum(13)) //true, false
    val tuple =("Deepu", 3,2,5,2,7,8,9,"Raj")
    println(tuple._9)
    println(tuple._1)
    println(tuple._5)
    val a = tuple._4
    val Mdata = Map(1-> "1", 2->"Raj", 3->"Rajan", 4->"Hadoop")
    println(Mdata.keys)
    println(Mdata.values)
    println(Mdata.get(2))
    val t = numbers.map { x => x*2 }
    println(t.toString())
    val TT = List(1,2,3).zip(List("a","b","c"))
    println(TT(0))     
    println(" DEEPU " + abc.find((i:Int) => i>0))   
    //println(numbers.find((i: Int) => i > 5))
    println("Array " + numbers.filter((i: Int) => i % 2 == 0))
    println("List " + abc.filter((i: Int) => i % 2 == 0))
    println("Set" + snum.filter((i: Int) => i % 2 == 0))
    
   } 
}