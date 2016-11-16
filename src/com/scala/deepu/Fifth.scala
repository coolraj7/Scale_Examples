package com.scala.deepu/**
 * @author coolraj7
 */

class ObjectOnlyCounter {
  private var counter = 0
  def incr() { counter += 1 }
  def current = counter
  def isless(otherVal: ObjectOnlyCounter) = counter < otherVal.counter
}

class Fifth {
  private var counter = 0
  def incr() {
    counter += 1
    println(counter)
  }
  def current = counter
  def isLess(otherVal: Fifth) = counter < otherVal.counter
}


/**
 * @author coolraj7
 */
object Fifth1 extends App {
  //  var f1 = new ObjectOnlyCounter
  //  var f2 = new ObjectOnlyCounter
  var f1 = new Fifth
  var f2 = new Fifth

  println(f1.current)
  f1.incr()
  println(f1.current)

  f1.incr()
  println(f1.current)

  println(f2.current)
  f2.incr()
  println(f2.current)
  println(f2.isLess(f1))
}