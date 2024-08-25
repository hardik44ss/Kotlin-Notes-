fun main(){
  val isKotlinFun: Boolean = true 
  val isFishTasty = false //Can be written without specifying type { remove " : " }
  println(isKotlinFun)   // Outputs true
  println(isFishTasty)   // Outputs false 

  println(10 > 9) // Returns true, because 10 is greater than 9
  println(10 == 15)

  //Conditional statements
  val time = 22
  val greeting = if (time < 10) {
    "Good morning."  // Return statement
  } else if (time < 20) {
    "Good day."
  } else {
     "Good evening."
  }// Outputs "Good evening."
  println(greeting)

   val t = 2
   val greet = if (t < 18) "Good day." else "Good evening."
   println(greet)

   //When : its like switch statement 
  
val day = 4
val result = when (day) {
  1 -> "Monday"
  2 -> "Tuesday"
  3 -> "Wednesday"
  4 -> "Thursday"
  5 -> "Friday"
  6 -> "Saturday"
  7 -> "Sunday"
  else -> "Invalid day."
}
println(result)

// Outputs "Thursday" (day 4)
  
}
