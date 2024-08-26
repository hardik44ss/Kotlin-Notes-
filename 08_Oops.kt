// OOP is faster and easier to execute
// OOP provides a clear structure for the programs
// OOP helps to keep the Kotlin code DRY "Don't Repeat Yourself", 
// --DRY : reducing the repetation of code
// OOP makes it possible to create full reusable applications with less code and shorter development time

fun main() {
    val person1 = Person("John", 25)
    person1.displayInfo()

    val person2 = Person("Hardik",12)
    person2.displayInfo()
}

// Define a class 'Person'
class Person(val name: String, private val age: Int) {
    fun displayInfo() { // Method to display information about the person
        println("Name: $name, Age: $age")
    }
}
