package com.scala.deepu

/**
 * @author rajde
 */

abstract class Animy{
  var weight: Double
}
class Jiffy extends Animy{
  var weight: Double =15.00
}

class Pinky extends Animy{
  def weight = 123.00
  def weight_=(weight: Double): Unit ={ println("HELLO !")}
}
object PrvCon4 {
  
  def main(args: Array[String]): Unit ={
    println("We are in the main Program")
  }
  
}