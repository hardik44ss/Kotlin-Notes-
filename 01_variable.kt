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
}
