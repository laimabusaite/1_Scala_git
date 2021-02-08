import scala.io.StdIn.readLine

object TemperatureTester extends App {
  //TODO write a program which asks for user's temperature
  //if Temperature is over 37C print a warming about high temperature
  //if temperature is under 35 print a warning about being cold
  //otherwise print that everything is great :0

  val myTemperature = readLine("Temperature: ").toFloat
  if (myTemperature > 37.0) {
    println(s"High temperature: $myTemperature")
  } else  if (myTemperature < 36.0) {
    println(s"Low temperature: $myTemperature")
  } else {
    println(s"Normal temperature: $myTemperature")
  }

}
