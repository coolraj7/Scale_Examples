package com.scala.deepu

/**
 * @author rajde
 */

class Cats(val tailSize: Double) {

}

class Dogs private (val earSize: Double) {
  def this() = {
    this(5.0)
  }
}

object PrvCons {

  val cat = new Cats(2)
  println("Cat's tailSice  =" + cat.tailSize)

  val dog = new Dogs()
  println("Dog's earSize  =" + dog.earSize)

  def main(args: Array[String]): Unit = {
    println("We are Testing from main method")
  }
}