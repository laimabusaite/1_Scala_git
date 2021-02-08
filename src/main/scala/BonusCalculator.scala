import scala.io.StdIn.readLine

object BonusCalculator extends App {
  //TODO Calculate yearly Xmas Bonus
  //Ask for Employee Name
  val employee = readLine("What is your name? ")
  println(s"Nice to talk to you $employee!")

  val timeWorked = readLine("Years worked: ").toInt
  val monthlyWage = readLine("Monthly wage: ").toDouble

  val bonus = ((if (timeWorked >= 2) timeWorked-2 else 0) * 0.15 * monthlyWage * 100.0).round / 100.0

  println(s"Your holiday bonus is $bonus")

  //Ask for how long they have worked
  //ask for monthly wage
  //Calculate Xmas bonus if they have worked at least 2  years
  //Bonus is years worked over 2 years * 15% of monthly wage
  //so 5 years worked, 1000 Euros wage would give 450 Euro bonus
}
