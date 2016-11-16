

package com.scala.deepu/**
 * @author coolraj7
 */
class Six(val size:Int, val age:Int) {
  println("Inside the Six Constuctor")
  def desc="Deepu is of  age " + age + " & is of size " +size  
}

/**
 * @author coolraj7
 */
object Six1 extends App {
  val six = new Six(10,10)
  println(six.desc)
}