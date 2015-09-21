
class First {
  def SayHi() = println("Hello Guys")
}

object HelloObj extends App{
  
  {
  val hello = new First()
  hello.SayHi()
  }
}