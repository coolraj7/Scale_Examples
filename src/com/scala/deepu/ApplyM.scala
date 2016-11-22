package com.scala.deepu

/**
 * @author rajde
 */

object Tree {
  def apply(centi: Double): Unit = {
    println("The measure in centi is  = " + centi)
  }
}

object Rock {
  def apply(size: Double): Unit = {
    println("The size of the Rock is =  " + size)
  }
}
object ApplyM {
  def main(args: Array[String]): Unit = {
    Tree(13.10)
    Rock(12.01)
  }
}