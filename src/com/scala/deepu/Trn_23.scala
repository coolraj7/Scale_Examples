

package com.scala.deepu
/**
 * @author rajde
 */

abstract class Animal {
  var weight: Double
}

class Dog extends Animal {
  var weight: Double = 15
}

class Cat extends Animal {
  def weight = 123
  def weight_=(v: Double): Unit = { println("HELLO") }
}

abstract class Vehicle{
  var speed: Double
}
class Plane extends Vehicle{
  var speed: Double = 500
}
class Car extends Vehicle{
  def speed = 100
  def speed_= (v:Double): Unit ={println("HELLO DEEPU")}
}

object Trn23{
  def main(args: Array[String]): Unit ={
    println(" THIS IS SCALA PROGAM 1")
    var alto = new Car()
    println(alto)
    println(alto.speed)
    var boeing = new Plane()
    println(boeing.speed)
  }
  def ensure(b: Boolean, mesg:String ="Solution isnt totally correct"){
    if(!b) throw new Exception(mesg)
  }
}