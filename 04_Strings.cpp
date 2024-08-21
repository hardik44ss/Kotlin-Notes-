fun main() {
    // Kotlin Strings
    // Creating a string
    var greeting = "Hello"
    println("Greeting: $greeting") // Output: Greeting: Hello

    // Specifying the type explicitly
    var greetingExplicit: String = "Hello"
    println("Greeting Explicit: $greetingExplicit") // Output: Greeting Explicit: Hello

    // Creating a String without assigning a value initially
    var name: String
    name = "John"
    println("Name: $name") // Output: Name: John

    // Accessing characters in a String
    var txt = "Hello World"
    println("First character: ${txt[0]}") // Output: First character: H
    println("Third character: ${txt[2]}") // Output: Third character: l

    // String Length
    println("The length of the txt string is: ${txt.length}") // Output: The length of the txt string is: 11

    // String Functions
    println("Uppercase: ${txt.toUpperCase()}") // Output: Uppercase: HELLO WORLD
    println("Lowercase: ${txt.toLowerCase()}") // Output: Lowercase: hello world

    // Comparing Strings
    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println("Comparison result: ${txt1.compareTo(txt2)}") // Output: Comparison result: 0 (they are equal)

    // Finding a String in a String
    var searchString = "Please locate where 'locate' occurs!"
    println("Index of 'locate': ${searchString.indexOf("locate")}") // Output: Index of 'locate': 7

    // Quotes Inside a String
    var txt1Quotes = "It's alright"
    var txt2Quotes = "That's great"
    println(txt1Quotes) // Output: It's alright
    println(txt2Quotes) // Output: That's great

    // String Concatenation
    var firstName = "John"
    var lastName = "Doe"
    println("Full Name using + operator: $firstName $lastName") // Output: Full Name using + operator: John Doe
    println("Full Name using plus() function: ${firstName.plus(lastName)}") // Output: Full Name using plus() function: JohnDoe

    // String Templates/Interpolation
    println("My name is $firstName $lastName") // Output: My name is John Doe
}
