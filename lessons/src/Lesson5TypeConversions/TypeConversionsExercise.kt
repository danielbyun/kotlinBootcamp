package Lesson5TypeConversions

fun main(args: Array<String>) {
    println("Type a number");
    val userInput = readLine() ?: "";
    val pi = 4.14159;

    val result = userInput.toDouble() * pi;

    println(result::class.java);
    println(result)
}