object FunctionExercises extends App {
  def isPalindrome(text:String) = {
    //TODO actually check if the text reads the same from both ways
    //"alus ari ir sula" that's a palindrome
    //text.reverse should work :)
    text == text.reverse
  }

  def getCityYear(p0:Double, perc:Double, delta:Double, p:Double) = {
    var pIteration = p0
    var years = 0

    while ((pIteration < p) && (pIteration >= p0)){
      pIteration += pIteration * perc/100.0 + delta
      years += 1
//      println(pIteration, years)
    }
//    years
    if (pIteration >= p0) years else -1


  }
  //Write a function which takes 4 parameters p0, perc, delta, p
  //return integer of years when the population reaches p
  //yearly formula is previous year * percentage increas + delta
  //percentage is in percent so you will need to convert
  //delta is how many people leave or join the city every year
  //probably while loop will work best here
  //also consider that it is possible that city never reaches p, then you should return -1
  //hint: if population does not increase after first year it will never reach p

  //  println(getCityYear(1000,2,50,1200)) should print 3
  //  println(getCityYear(1000,2,-50,1200)) should print -1
  //  println(getCityYear(1500000,2.5,10000,2000000)) should print 10

  println(isPalindrome("alus ari ira sula"))
  val years = getCityYear(1000,2,50,1200)
  println(years)
  println(getCityYear(1000,2,-50,1200))
  println(getCityYear(1500000,2.5,10000,2000000))
}
