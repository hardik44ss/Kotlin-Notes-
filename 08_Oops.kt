// OOP is faster and easier to execute
// OOP provides a clear structure for the programs
// OOP helps to keep the Kotlin code DRY "Don't Repeat Yourself", 
// --DRY : reducing the repetation of code
// OOP makes it possible to create full reusable applications with less code and shorter development time
fun main() {
    val person1 = Person("John", 25)
    val person2 = Person("Hardik", 12)
    
    person1.displayInfo()
    person2.displayInfo()

    val c1 = Car("Ford", "Mustang", 1969)
    val c2 = Car("BMW", "X5", 1999)
    val c3 = Car("Tesla", "Model S", 2020)
    
    c1.displayCarInfo()
    c2.displayCarInfo()
    c3.displayCarInfo()
}

// Define a class 'Car'
class Car(var brand: String, var model: String, var year: Int) {
    // Method to display car information
    fun displayCarInfo() {
        println("Brand: $brand")
        println("Model: $model")
        println("Year: $year")
    }
}

// Define a class 'Person'
class Person(val name: String, private val age: Int) {
    // Method to display information about the person
    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}
