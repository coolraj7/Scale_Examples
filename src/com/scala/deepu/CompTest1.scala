package com.scala.deepu

/**
 * @author rajde
 */
class Tree11(val name: String, val size: Double) {
  private var growthSpeed = 25
}
object Tree11 {
  def speedUpTree(tree: Tree11): Unit = {
    tree.growthSpeed = 23;
  }
}

object CompTest1 {
  def main(args: Array[String]): Unit = {
    Tree11.speedUpTree(new Tree11("Big Tree", 12.32))
    println("Changed Tree")
  }

}