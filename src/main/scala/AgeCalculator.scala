import java.time.Year
import java.util.Calendar
import scala.io.StdIn.readLine

object AgeCalculator extends App {
  println("This program will calculate the year when you will be 100")
  //TODO ask for person's name
  //TODO ask for person's age
  //TODO calculate and display year when they will be 100 :)
  val targetYear = 100
  val now = Calendar.getInstance()
  val currentYear = now.get(Calendar.YEAR)
  val personsName = readLine("What is your name?")
  val personsAge = readLine(s"Hello, $personsName! How old are you?").toInt
  val yearNow = Year.now.getValue
  val year100 = currentYear - personsAge + targetYear
  println(s"It is now year $yearNow.")
  println(s"You will be 100 years old in year $year100.")
}
