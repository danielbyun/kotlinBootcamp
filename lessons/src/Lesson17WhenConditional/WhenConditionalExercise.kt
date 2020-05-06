package Lesson17WhenConditional

fun main(args: Array<String>) {
    /*
    Ask the user to input their name
    based on the first letter of their name, print out a personalized greeting
    - for the first 3 letters of the alphabet
    - a different one for the next 3 letters
    - and a third message for the rest
    */

    println("What's your name?")

    val userInput = readLine() ?: ""
    val message = when (userInput.length) {
        in 0..2 -> "taint"
        in 3..5 -> "smelly gonads"
        in 5..7 -> "taint shaped like a pickle"
        else -> "fiery testicles"
    } // did this wrong lmao

    val customMessage = when (userInput[0].toString()) {
        "a", "b", "c" -> "sup loser"
        in "d".."f" -> "get in loser"
        else -> "were going shopping"
    }

    println(message)
    println(customMessage)
}