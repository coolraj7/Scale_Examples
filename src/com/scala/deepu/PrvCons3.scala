package com.scala.deepu

/**
 * @author rajde
 */

abstract class Anmi(age: Int) {
  //def isold = age>10
}

class Kitty(val age: Int, val tailSize: Double) extends Anmi(age)
class Jacky(val age: Int, val earSize: Double) extends Anmi(age)

object PrvCons3 {

  val cat = new Kitty(1, 2.2)
  println("Cat's tailSice  =" + cat.tailSize)

  val dog = new Jacky(1, 1.2)
  println("Dog's earSize  =" + dog.earSize)

  def main(args: Array[String]): Unit = {
    println("WE ARE TESTING SCALA")
    val test = new Jacky(1, 10)
    println(test.age)
    println(test.earSize)
    val test1 = new Kitty(3, 500.12)
    println(test1.age)
    println(test1.tailSize)
  }
}