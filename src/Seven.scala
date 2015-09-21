



object SingletonReservation{
  private var lastNum=0;
  def newReservationNumber() ={lastNum+=1;lastNum}
}
object Seven extends App {
  var r1= SingletonReservation.newReservationNumber()
  var r2= SingletonReservation.newReservationNumber()
  var r3= SingletonReservation.newReservationNumber()
  println("r1: " + r1)
  println("r2: " + r2)
  println("r3: " + r3)

}