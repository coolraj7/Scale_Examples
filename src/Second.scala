

/**
 * @author coolraj7
 */
class Second {
  private var value = 2
  def increment() { value = value + 1 }
  def current() = value
}

object Second1 extends App {
  val mySecond = new Second
  println(mySecond.increment)
  mySecond.increment
  println(mySecond.current)
}