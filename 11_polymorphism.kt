fun main() {
    // Compile-time Polymorphism (Method Overloading)
    val calculator = Calculator()
    println("Sum of 2 and 3: ${calculator.add(2, 3)}")
    println("Sum of 2.5 and 3.5: ${calculator.add(2.5, 3.5)}")
    println("Sum of 2, 3 and 4: ${calculator.add(2, 3, 4)}")

    // Runtime Polymorphism (Method Overriding)
    val animal: Animal = Dog() // Animal reference, Dog object
    animal.makeSound() // Calls the overridden method in Dog

    val anotherAnimal: Animal = Cat() // Animal reference, Cat object
    anotherAnimal.makeSound() // Calls the overridden method in Cat
}

// Compile-time Polymorphism: Method Overloading
class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}

// Base class
open class Animal {
    open fun makeSound() {
        println("The animal makes a sound")
    }
}
// Subclass Dog overriding makeSound method
class Dog : Animal() {
    override fun makeSound() {
        println("The dog barks")
    }
}
// Subclass Cat overriding makeSound method
class Cat : Animal() {
    override fun makeSound() {
        println("The cat meows")
    }
}
