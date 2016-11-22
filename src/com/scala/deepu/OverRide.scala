package com.scala.deepu

/**
 * @author rajde
 */

class Hen(val name:String, val size: Double){
  override def toString = "Hen ( " + name + " , " + size + ")"
}
object Hen {
  def apply(name: String, size: Double): Hen = new Hen(name, size)
}
object OverRide {
  def main (args: Array[String]): Unit={
    println(Hen("Packao", 12.21))
  }
  
}