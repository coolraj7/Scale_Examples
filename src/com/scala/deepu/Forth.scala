

package com.scala.deepu/**
 * @author coolraj7
 */
class Forth {
  private var privateT=0
  def age= privateT
  def age_=(newT:Int){if (newT > privateT) privateT=newT;}  
}
/**
 * @author coolraj7
 */
object Forth1 extends App {
  var d= new Forth
  println(d.age)
  d.age_=(-10)
  println(d.age)
  d.age_=(10)
  println(d.age)
}