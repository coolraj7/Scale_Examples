
class First {
  def SayHi() = println("Hello Guys")
}

object HelloObj extends App{
  //def main(args:Array[String])
  {
  val hello = new First()
  hello.SayHi()
  }
}