package Lesson11Nullability.NullOperators

fun main(args: Array<String>) {
    /*
    * Read a number from the console and convert it to Double.
    * multiply it by 7, and convert the result into a string.
    * print the length of that string to the console
    */
    println("Give me a number")
    val userNumber = readLine() ?: "";
    val userNumberDouble = userNumber.toDouble();
    val result = userNumberDouble * 7;
    val resultString = result.toString().length;

    println("Length of the result: $resultString")
}