package com.scala.deepu
/**
 * @author rajde
 */

abstract class amy( val age: Int)

class catty (override  val age : Int, val tailSize: Double) extends amy(age)
class doggy (override  val age : Int, val earlSize: Double) extends amy(age)

object kutty extends catty(4, 2.33)
object dogy extends doggy(4, 2.33)


object ObjInh {
  def main(args: Array[String]): Unit={
    println("kutty =  " + kutty.age + " More Data = " + kutty.tailSize )
    println("dogy  = " + dogy.age + " More Data  = " + dogy.earlSize)
  }
}