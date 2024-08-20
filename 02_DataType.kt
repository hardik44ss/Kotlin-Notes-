fun main(){
  val myNum = 5             // Int
  val myDoubleNum = 5.99    // Double
  val myLetter = 'D'        // Char
  val myBoolean = true      // Boolean
  val myText = "Hello"      // String
/*val myNum: Int = 5                // Int
  val myDoubleNum: Double = 5.99    // Double
  val myLetter: Char = 'D'          // Char
  val myBoolean: Boolean = true     // Boolean
  val myText: String = "Hello"      // String
*/
  val myNum: Byte = 100 //from -128 to 127
  println(myNum)
  
  val myNum: Short = 5000//from -32768 to 32767
  println(myNum)

  val myNum: Int = 22323 // from -2147483648 to 2147483647
  print(myNum)

  val myNum: Long = 15000000000L // -9223372036854775808 to 9223372036854775807
  println(myNum)

  //Diff between int and long
  val myNum1 = 2147483647  // Int
  val myNum2 = 2147483648  // Long

  //Diff between float and double
  val myNum: Float = 5.75F
  val myNum: Double = 34.23

  //Unlike Java, you cannot use ASCII values to display certain characters. The value 66 would output a "B" in Java, but will generate an error in Kotlin:
  val myLetter: Char = 66
  println(myLetter) // Error
//Type conversion
  val x: Int = 5
  val y: Long = x
  println(y) // Error: Type mismatch 

  //To convert a numeric data type to another type, you must use one of the following functions: toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():
  val byteValue: Byte = 10.toByte()
  val shortValue: Short = 100.toShort()
  val intValue: Int = 1000.toInt()
  val longValue: Long = 100000.toLong()
  val floatValue: Float = 10.5.toFloat()
  val doubleValue: Double = 10.5.toDouble()
  val charValue: Char = 'A'.toChar()

}
  
