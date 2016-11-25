package com.scala.deepu

/**
 * @author rajde
 */
object TuplesEx {
 val tupleA : Tuple3[String, Boolean, Int] = new Tuple3[String, Boolean, Int]("DEEPU", true, 200)
  println("Tuple_Contect " + tupleA._1)
  println("Tuple_Contect " + tupleA._2)
  println("Tuple_Contect " + tupleA._3)
  
  
  def main(args: Array[String]): Unit={
  val tupleA : Tuple3[String, Boolean, Int] = new Tuple3[String, Boolean, Int]("DEEPU", true, 200)
  println("Tuple_Contect " + tupleA._1)
  println("Tuple_Contect " + tupleA._2)
  println("Tuple_Contect " + tupleA._3)
  }
}