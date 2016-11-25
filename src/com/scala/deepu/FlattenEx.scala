package com.scala.deepu

/**
 * @author rajde
 */

object FlattenEx {

  val st = "a" :: "b" :: "c" :: Nil
  val st2 = st.map(st => List(st.toLowerCase(), st.toUpperCase()))
  val stFlat = st2.flatten
  println(st2)
  println(st)
  println(stFlat)
  println("We are Using FlatMap  =  " +st.flatMap {st => List(st.toLowerCase(), st.toUpperCase()) })
  def main(args: Array[String]):Unit ={
    
  }
}