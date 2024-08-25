fun main() {
    //Continue : use to skip the iteration
    //Break : use to stop the iteration
    var x = 0
    var y = 0

    println("Example 1: Nested while loop with break and continue")
    // Example 1: Nested while loop with break and continue
    while (x < 10) {
        y = 0
        while (y < 10) {
            if (x == y) {
                println("Skipping when x equals y: x = $x, y = $y")
                y++
                continue  // Skip the rest of this iteration when x equals y
            }
            if (y == 7) {
                println("Breaking inner loop when y = 7")
                break  // Exit the inner loop when y equals 7
            }
            println("x = $x, y = $y")
            y++
        }
        if (x == 5) {
            println("Breaking outer loop when x = 5")
            break  // Exit the outer loop when x equals 5
        }
        x++
    }
    
    println("\nExample 2: Using while with a complex condition")
    
    // Resetting x and y for a new example
    x = 0
    y = 0
    
    // Example 2: Using while with a complex condition
    while (x * y < 50) {
        x++
        y = x * 2
        if (y % 3 == 0) {
            println("Skipping when y is divisible by 3: x = $x, y = $y")
            continue  // Skip this iteration when y is divisible by 3
        }
        println("x = $x, y = $y")
    }
    
    println("\nExample 3: Infinite while loop with break")
    
    // Example 3: Infinite while loop with break
    x = 1
    while (true) {
        println("Current x: $x")
        x++
        if (x == 15) {
            println("Breaking infinite loop at x = 15")
            break  // Exit the loop when x equals 15
        }
    }
}
