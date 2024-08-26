fun main() {
    // Single Inheritance
    val dog = Dog("Bulldog")
    dog.showSpecies()
    dog.bark()

    // Multilevel Inheritance
    val labrador = Labrador("Labrador Retriever")
    labrador.showSpecies()
    labrador.bark()
    labrador.swim()

    // Hierarchical Inheritance
    val cat = Cat("Persian")
    cat.showSpecies()
    cat.meow()

    // Multiple Inheritance through interfaces
    val flyingFish = FlyingFish("Flying Fish")
    flyingFish.showSpecies()
    flyingFish.swim()
    flyingFish.fly()
}

// Base class
open class Animal(val species: String) {
    fun showSpecies() {
        println("Species: $species")
    }
}

// Single Inheritance: Dog inherits from Animal
class Dog(species: String) : Animal(species) {
    fun bark() {
        println("--The dog barks!")
    }
}

// Multilevel Inheritance: Labrador inherits from Dog, which inherits from Animal
class Labrador(species: String) : Dog(species) {
    fun swim() {
        println("--The Labrador swims!")
    }
}

// Hierarchical Inheritance: Cat inherits from Animal
class Cat(species: String) : Animal(species) {
    fun meow() {
        println("--The cat meows!")
    }
}

// Multiple Inheritance through interfaces
interface Swimmer {
    fun swim()
}

interface Flyer {
    fun fly()
}

class FlyingFish(species: String) : Animal(species), Swimmer, Flyer 
//Kotlin doesn't support multiple , we can use interface classes
    override fun swim() {
        println("--The Flying Fish swims!")
    }

    override fun fly() {
        println("--The Flying Fish flies!")
    }
}
