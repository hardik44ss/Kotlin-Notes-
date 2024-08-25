fun main() {
    // 1. Ranges with Characters
    println("Printing the alphabet from 'a' to 'x':")
    for (char in 'a'..'x') {
        print("$char ")
    }
    println("\n")

    // 2. Ranges with Numbers
    println("Printing numbers from 5 to 15:")
    for (num in 5..15) {
        print("$num ")
    }
    println("\n")

    // 3. Check if a Value Exists in an Array
    val nums = arrayOf(2, 4, 6, 8)
    if (2 in nums) {
        println("2 exists in the nums array!")
    } else {
        println("2 does not exist in the nums array.")
    }

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("Volvo exists in the cars array!")
    } else {
        println("Volvo does not exist in the cars array.")
    }
    println()

    // 4. Break or Continue a Range
    println("Stopping the loop when num is equal to 10:")
    for (num in 5..15) {
        if (num == 10) {
            break  // Stops the loop when num equals 10
        }
        print("$num ")
    }
    println("\n")

    println("Skipping the value of 10 in the loop:")
    for (num in 5..15) {
        if (num == 10) {
            continue  // Skips the value 10
        }
        print("$num ")
    }
    println("\n")

    // 5. Creating and Calling Functions
    myFunction()  // Call the function
    println()

    // Calling the function multiple times
    myFunction()
    myFunction()
    println()

    // 6. Function with Parameters
    myFunctionWithParams("Hardik")
    myFunctionWithParams("Mohit")
    myFunctionWithParams("Muskan")
}

// Function without parameters
fun myFunction() {
    println("myFunciton called ")
}

// Function with a parameter
fun myFunctionWithParams(fname: String) {
    println("$fname Suthar")
}
