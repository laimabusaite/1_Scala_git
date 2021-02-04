object MyApp extends App {
  println("Print line")
  println()
  println("123")
  println()
  val myName = readLine("What is your name?")
  val favoriteFood = readLine(s"Hello, $myName! What is your favorite food?")
  println(s"Cool, I like $favoriteFood as well!")
  val currentPrice = readLine(s"How much $favoriteFood cost?").toFloat
  val currentMoney = readLine("How much money do you have?").toFloat
  val maxPurchaseWeight = currentMoney / currentPrice
//  println(s"Congratulation $myName! You can buy ${(maxPurchaseWeight*100).round / 100.toDouble} kg of $favoriteFood right now.")
  println(s"Congratulation $myName! You can buy ${(maxPurchaseWeight*100).round / 100.0} kg of $favoriteFood right now.")

  val isRaining = false
  val isSnowing = true
  val isCold = true



}
