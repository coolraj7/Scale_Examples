package com.scala.deepu

/**
 * @author rajde
 */
object Scala_Method {

  var log: String = "DEEPU RAJ"
  def logMeggage(s: String): Unit = {
    log = log + "\n" + s
  }
  def getLog(): String = {
    return log
  }
  var counter: Int = 130

  def incrementCounter(amount: Int): Unit = {
    counter = counter + amount
  }
  def count(): Int = counter
  def main(args: Array[String]): Unit = {
    println("count(): " + count())
    (count() == 120)
    println("count(): " + count())
    println("incrementCounter(10)")
    incrementCounter(10)
    println("count(): " + count())
    (count() == 10)
    println("incrementCounter(5)")
    incrementCounter(5)
    println("count(): " + count())
    (count() == 15)
  }
}