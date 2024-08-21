fun main() {
    var x = 10
    var y = 5

    // Arithmetic Operators
    println("Addition : " + (x + y))   // Addition
    println("Subtraction : "+(x - y))  // Subtraction
    println("Multiplication : "+(x * y))   // Multiplication
    println("Division : "+(x / y))   // Division
    println("Modulus : "+(x % y))   // Modulus

    x++              // Increment
    y--              // Decrement
    println(x)
    println(y)

    // Assignment Operators
    println("Assignment Operators
    x += 3
    println(x)       // x = x + 3
    x -= 2
    println(x)       // x = x - 2
    x *= 2
    println(x)       // x = x * 2
    x /= 2
    println(x)       // x = x / 2
    x %= 3
    println(x)       // x = x % 3

    // Comparison Operators
    println("COmparision Operators
    println(x == y)  // Equal to
    println(x != y)  // Not equal
    println(x > y)   // Greater than
    println(x < y)   // Less than
    println(x >= y)  // Greater than or equal to
    println(x <= y)  // Less than or equal to

    // Logical Operators
    println(x < 5 && x < 10)   // Logical AND
    println(x < 5 || x < 4)    // Logical OR
    println(!(x < 5))          // Logical NOT
}
