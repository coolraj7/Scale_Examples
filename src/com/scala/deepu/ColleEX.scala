package com.scala.deepu

/**
 * @author rajde
 */
object ColleEX {

  val Test = "a" :: "b" :: "c" :: Nil
  Test.foreach((abc: String) => {
    println(abc)

  })

  var num = 1 :: 2 :: 3 :: Nil
  num.foreach((number: Int) => {
    println("Number = " + number)
    var Numbermapped = num.map { num => num + 10 }
    Numbermapped.foreach((ttk: Int) => {
      println("New Data " + ttk)
    })
    println()
  })

  def main(args: Array[String]): Unit = {
    val Test = "a" :: "b" :: "c" :: Nil
    Test.foreach((abc: String) => {
      println(abc)

    })

    var num = 1 :: 2 :: 3 :: Nil
    num.foreach((number: Int) => {
      println("Number = " + number)
    })
    println("DEEPU TESTING   = " + num.map(a => List(a+10, a, a+20)).flatten)
    num.foreach((ni : Int)=>{
      println("DEEPU " + ni)
    })

  }

}