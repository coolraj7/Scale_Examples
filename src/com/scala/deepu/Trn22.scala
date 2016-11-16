package com.scala.deepu
/**
 * @author rajde
 */
abstract class Animal(val age : Int)

class Cat(age: Int, protected val tailSize: Double) extends Animal(age){
  def sound(): Unit= println("miew")
  def this(tailSize: Double) = this(3, tailSize)
}

class Dog(age: Int, private var earSize: Double) extends Animal(age)

abstract class Vehicle(val manufacturer: String)
class Car(manufacturer: String, var wheelSize: Double) extends Vehicle(manufacturer){
  def this(wheelSize: Double) = this("Ferrari", wheelSize)
}
class Plane(manufacturer: String, var maxHeight) extends Vehicle(manufacturer)


object Trn22 {
  def main(args: Array[String]): Unit = {}
}
