/**
 * @author rajde
 */

object Functional extends App {
  println("TESTING FUNCTIONAL PROGRAMMING")
  println(List(1, 2, 3).map { a: Int => a * 2 })
  println(List(1, 2, 3).map { a: Int => a * 2 })
  println(List(1, 2, 3) map { a: Int => a * 2 })
  println((1).+(4))
  println(List(1, 2, 3).map { _ * 4 })
  println(List(1, 2, 3, 4, 5) filter { _ % 2 == 0 })
  println(List(1, 2, 3, 4, 5).filter { _ % 2 == 0 })
  println(List(1, 2, 3, 4, 5) sum)
  println(List(1, 2, 3, 4, 5).partition { _ % 2 == 0 })
  println(List(1, 2, 3, 4, 5).takeWhile { _ < 4 })
  println(List(1, 2, 3, 4, 5).dropWhile { _ < 4 })
  println(List(1, 2, 3, 4, 5, 4, 3, 2, 1).takeWhile { _ < 4 })
  println(List(1, 2, 3, 4, 5, 1, 2, 3, 4) span { _ < 4 })

  val plus = { a: Int => { b: Int => a + b } }
  println(plus(1))
  println(plus(1)(1))

  val plusOne = plus(1)
  println(plusOne)

  val A1 = Array(1, 2, 3, 4, 5)
  A1.foreach(println)
  A1.foreach(i => println(i))
  println(A1.reduceLeft((x, y) => x + y))
  println(A1.foldLeft(0)(_ + _))
  
}