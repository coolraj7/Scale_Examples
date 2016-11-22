package com.scala.deepu

/**
 * @author rajde
 */

class Tree1(val name: String, val size: Double)
object Tree1 {
}
class Rock1(val name: String, val size: Double)
object Rock1 {
}

object CompTest {
  def main(args: Array[String]) {
    println("We are in the Main Method")
    println(new Tree1("OAK", 12.12).name)
    println(new Tree1("OAK", 12.12).size)
    println(new Rock1("ABC", 1.34).name)
    println(new Rock1("DEF", 2.34).size)
  }
}