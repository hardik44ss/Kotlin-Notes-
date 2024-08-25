fun main() {
    //Note : When you create a variable with the val keyword, the value cannot be changed/reassigned.
    //When using var, you can change the value whenever you want:

    //var variableName = value
	var a ="Hardik " 
	var b ="Suthar"
	println(a+b)
	var name: String = "John" // String
	val birthyear: Int = 1975 // Int

	/*var name
	name ="Hardik " //This produce error */

	println(name)
	println(birthyear)

	name = "John" // name is var
	name = "Robert"
	println("Hello " + name)
	val pi = 3.14159265359
	println(pi)

//Array 
   val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    
    println("First car: ${cars[0]}")// Outputs: Volvo
    
    cars[0] = "Opel"// 3. Changing an array element
    println("First car after change: ${cars[0]}")// Outputs: Opel

    println("Number of cars: ${cars.size}")  //Array Length / Size : 4
    
    // 5. Check if an element exists in the array
    if ("Volvo" in cars) {
        println("Volvo exists in the array!")
    } else {
        println("Volvo does not exist in the array.")
    }// Outputs: Volvo does not exist in the array. (since it was changed to "Opel")
    
    // 6. Loop Through the Array
    println("All cars in the array:")
    for (car in cars) {
        println(car)
    }
}
