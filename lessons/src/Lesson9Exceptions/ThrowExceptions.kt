package Lesson9Exceptions

import java.lang.IllegalStateException

fun main(args: Array<String>) {
    println("test something");
    val userInput = readLine() ?: "";

    if (userInput.isBlank() && userInput.isEmpty()) {
        throw IllegalStateException("How dare you")
    } else {
        println(userInput)
    }
}