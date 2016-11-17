package com.scala.deepu
/**
 * @author rajde
 */

abstract class Animal1 {
  var weight: Double
}

class Dog1 extends Animal1 {
  var weight: Double = 15
}

class Cat1 extends Animal1 {
  def weight = 123
  def weight_=(v: Double): Unit = { println("HELLO") }
}

abstract class Vehicle1{
  var speed: Double
}
class Plane1 extends Vehicle1{
  var speed: Double = 500
}
class Car1 extends Vehicle1{
  def speed = 100
  def speed_= (v:Double): Unit ={println("HELLO DEEPU")}
}

object Trn23{
  def main(args: Array[String]): Unit ={
    println(" THIS IS SCALA PROGAM 1")
    var alto = new Car1()
    println(alto)
    println(alto.speed)
    var boeing = new Plane1()
    println(boeing.speed)
  }
  def ensure(b: Boolean, mesg:String ="Solution isnt totally correct"){
    if(!b) throw new Exception(mesg)
  }
}