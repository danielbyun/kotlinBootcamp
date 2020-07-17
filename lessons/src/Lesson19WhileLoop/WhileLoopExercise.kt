package Lesson19WhileLoop

fun main(args: Array<String>) {
    // ask the user to input a large integer

    // print out all the numbers that are divisible by 7, that are
    // less than the user's number

    println("Print a large ass number")
    val userInput = readLine() ?: "0"
    val number = userInput.toInt()

    var index = 1
    while (index < number) {
        if (index % 7 == 0) {
            println(index)
        }
        index++
    }
}