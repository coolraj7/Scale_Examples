package com.scala.deepu

/**
 * @author rajde
 */
object LazyVar {
  
  lazy val value1 ={print("Acessing value 1 -- "); 11}
  lazy val value2 ={print("Acessing value 2 -- "); 22}
  
  
  println("First Time")
  println(value2)
  println(value1)
  
  println("Second Time")
  println(value2)
  println(value1)
  
  def main (args: Array[String]): Unit={
    
  }
}