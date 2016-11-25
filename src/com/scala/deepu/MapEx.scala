package com.scala.deepu

/**
 * @author rajde
 */
object MapEx {
  
  def main(args: Array[String]): Unit = {
  var intString = Map[Int, String]((1, "One"), (2, "TWO"), (3, "Tree"))
  intString = intString + (4 -> "Four")
  intString = intString ++ List((5->"Five"), (6 -> "Six"))
  println("intString" + intString)
  }
}