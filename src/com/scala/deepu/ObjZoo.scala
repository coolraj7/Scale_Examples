package com.scala.deepu

/**
 * @author rajde
 */

object zoo {
  val address = "Trooango Zoo, Sydney"
  val phone = "314 424 4242"

}
object ObjZoo {
   val ZooAddress = zoo.address
  
  println("Address of Zoo = " + ZooAddress )
  def main (args: Array[String]): Unit={
  val dest = zoo.phone
  println("Phone number of Zoo = " + dest)
  
  println("WE ARE TESTING SCALA")
  
  }
}