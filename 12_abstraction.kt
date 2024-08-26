fun main() {
    // Using abstraction with an abstract class
    val circle: Shape = Circle(5.0)
    println("Circle Area: ${circle.area()}")
    circle.displayShape()  

    val rectangle: Shape = Rectangle(4.0, 6.0)
    println("Rectangle Area: ${rectangle.area()}")
    rectangle.displayShape()

    // Using abstraction with an interface
    val petrolCar = PetrolCar()
    petrolCar.refuel()
    petrolCar.startEngine()

    val electricCar = ElectricCar()
    electricCar.refuel()
    electricCar.startEngine()
}

// Abstract class
abstract class Shape {
    abstract fun area(): Double // Abstract method

    // Non-abstract method
    fun displayShape() {
        println("This is a shape")
    }
}

// Subclass Circle implementing the abstract method
class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

// Subclass Rectangle implementing the abstract method
class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}

// Interface
interface Vehicle {
    fun refuel() // Abstract method

    fun startEngine() { // Non-abstract method (default implementation)
        println("Engine started")
    }
}

// Class implementing the interface
class PetrolCar : Vehicle {
    override fun refuel() {
        println("Petrol car refueling...")
    }
}

// Class implementing the interface
class ElectricCar : Vehicle {
    override fun refuel() {
        println("Electric car charging...")
    }
}
