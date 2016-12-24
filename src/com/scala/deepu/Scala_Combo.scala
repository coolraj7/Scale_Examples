package com.scala.deepu

object Scala_Combo {
  def main(args: Array[String]): Unit = {
    val x= {val a=10; val b= 100; b-a}
    //val file = scala.io.Source.fromFile("abc.txt")
    lazy val file = scala.io.Source.fromFile("abc.txt")
    println(x)
    val args ="DEEPU RAJ";
    args.foreach { args => println(args)}
    val s=0
    for (i<- 1 to 3)println(s+i)
    println(area(10))
    val a = Array(1,2,4,2,1,3,42,7,67,68,68686,86868)
    a.foreach {a => println(a)}    
    val b = Array("Deepu", "Raj", "Rajan")
    b.foreach { b => println(b)}
    println(a.max)
    println(scala.util.Sorting.quickSort(a))
    println(a)
    val abc =(1,2, "Raj", "Deepu")
    println(abc._3);
  }   
  def area(radius: Int): Double = {3.14 * radius * radius}
}