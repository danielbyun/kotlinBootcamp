package Lesson19WhileLoop

fun main(args: Array<String>) {
    // print out a greeting message 10 times
    val numberOfMessages = 10;
    var index = 0;

    while (index < numberOfMessages) {
        println("Greetings bish $index")
        index++
    }

    // you have 5 cats
    val cats = listOf("Tigger", "Smokey", "Sassy", "Patch", "Sammy")
    // design a program that prints out a hello message for each cat,
    // using a while loop
    var catsIndex = 0;
    while (catsIndex < cats.size) {
        println("What's uppp ${cats[catsIndex]}??")
        catsIndex++
    }

    // ask the user to input an integer
    // calculate the factorial of that integer
    // the factorial of a number n is
    // 1 * 2 * 3 * ... * n

    println("Give me a number")
    val userInput = readLine() ?: "0"
    val userInputNumber = userInput.toInt()
    var userInputIndex = 1
    var factorial = 1L

    while (userInputIndex <= userInputNumber) {
        factorial *= userInputIndex
        userInputIndex++
    }

    println(factorial)
}