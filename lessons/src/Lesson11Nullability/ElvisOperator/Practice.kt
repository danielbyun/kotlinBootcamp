package Lesson11Nullability.ElvisOperator

fun main(args: Array<String>) {
    // read a message from the console
    // print out either the message or a default greeting
    val defaultGreeting = "SUp fuckers";
    println("Write a message");
    val userMessage = readLine() ?: "";
    println("Message: ${userMessage ?: defaultGreeting}")

    // read a number from the console
    // assume you know that the user has entered a value, and the read variable is not null.
    // multiply that number by 5 and print the result
    println("Give me a number, any number")
    val userNumber = readLine() ?: "";
    val result = userNumber.toInt() * 5;
    println("The result: $result")
}