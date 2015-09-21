/**
 * @author coolraj7
 */
class Eight {
  val id = Eight.newNum()
  private var bal = 0.0

}

object Eight {
  private var lastNum = 0;
  private def newNum() = {
    println(lastNum)
    lastNum += 1;
    println(lastNum)
    lastNum
  }
}

object DemoComp extends App {
  val r1 = new Eight
  println("id1: " + r1.id)
  println("id2: " + r1.id)
  val r2 = new Eight
  println("id1: " + r2.id)
  println("id2: " + r2.id)
}