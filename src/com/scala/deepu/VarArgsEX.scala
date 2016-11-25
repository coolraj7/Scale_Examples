package com.scala.deepu
/**
 * @author rajde
 */
object VarArgsEX {
  def printString(data: List[String]): Unit = { data.foreach(println(_)) }
  def main(args: Array[String]): Unit = {
    val abc = List("ABCD", "BEF", "CCDE", "DEFR")
    VarArgsEX.printString(abc)
  }
}