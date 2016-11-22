package com.scala.deepu

/**
 * @author rajde
 */

abstract class Animals{
  val Age: Int
}

class Catty( val Age: Int, val tailSize: Double) extends Animals


class Doggy( val Age: Int, val earSize: Double) extends Animals

object PrvCon1 {
  
  val cat = new Catty(1, 2.2)
  println("Cat's tailSice  =" + cat.tailSize)
  
  val dog = new Doggy(1, 1.2)
  println("Dog's earSize  =" + dog.earSize)
  
  
  def main (args: Array[String]): Unit ={
    
  }
}