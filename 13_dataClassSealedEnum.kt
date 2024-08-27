// Enum class to represent possible colors for shapes
enum class Color {
    RED, GREEN, BLUE, YELLOW, BLACK, WHITE
}

// Sealed class to represent different types of shapes
sealed class Shape {
    // Data class for Circle, inheriting from Shape
    data class Circle(val radius: Double, val color: Color) : Shape()

    // Data class for Rectangle, inheriting from Shape
    data class Rectangle(val length: Double, val width: Double, val color: Color) : Shape()

    // Data class for Triangle, inheriting from Shape
    data class Triangle(val base: Double, val height: Double, val color: Color) : Shape()
}

// Data class to represent a Drawing which contains a list of shapes
data class Drawing(val name: String, val shapes: List<Shape>) {
    // Function to calculate the total area of the drawing
    fun totalArea(): Double {
        return shapes.sumOf { shape ->
            when (shape) {
                is Shape.Circle -> Math.PI * shape.radius * shape.radius
                is Shape.Rectangle -> shape.length * shape.width
                is Shape.Triangle -> 0.5 * shape.base * shape.height
            }
        }
    }

    // Function to list all colors used in the drawing
    fun listColors(): Set<Color> {
        return shapes.map { shape ->
            when (shape) {
                is Shape.Circle -> shape.color
                is Shape.Rectangle -> shape.color
                is Shape.Triangle -> shape.color
            }
        }.toSet()
    }
}

fun main() {
    // Creating different shapes with specific colors
    val circle = Shape.Circle(radius = 5.0, color = Color.RED)
    val rectangle = Shape.Rectangle(length = 10.0, width = 20.0, color = Color.GREEN)
    val triangle = Shape.Triangle(base = 8.0, height = 6.0, color = Color.BLUE)

    // Creating a drawing containing the shapes
    val myDrawing = Drawing(
        name = "My First Drawing",
        shapes = listOf(circle, rectangle, triangle)
    )

    // Displaying the drawing details
    println("Drawing Name: ${myDrawing.name}")
    println("Total Area: ${myDrawing.totalArea()}")

    println("Colors used in the drawing:")
    myDrawing.listColors().forEach { color ->
        println("- $color")
    }
}
