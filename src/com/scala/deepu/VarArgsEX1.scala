package com.scala.deepu

/**
 * @author rajde
 */
object VarArgsEX1 {

  val str = "a" :: "b" :: "c" :: Nil
  def printString(str: String) { str.foreach(println(_)) }
  //
  def main(args: Array[String]): Unit = {
  
  }
}