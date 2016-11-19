package com.scala.deepu/**
 * @author rajde
 */

trait Logger {
  def log(msg: String)
}

class EX1 extends Logger {
  def log(msg: String) {  
    println("Deepu Testing")
    println(msg)}
}

object Main1 extends App {
  val logger = new EX1
  logger.log("Hi I am printing from Main")
}
