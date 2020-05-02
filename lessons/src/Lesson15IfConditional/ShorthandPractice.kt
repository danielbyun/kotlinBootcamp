package Lesson15IfConditional

fun main(args: Array<String>) {
    /*
    Read an integer from the console
    If it has a single digit, print out a message
    otherwise, print out a different message
    use the shorthand if statement
    */

    println("Give me a number")

    val userInput = readLine() ?: "0"
    val userNumber = userInput.toInt()
    val result = if (userNumber > 9) "double digit" else "single digit"

    println(result)

    /*
    You receive a message from a remote server. You have this message code in a variable
    var response = 404

    if the message starts with 1 -> print 'information response'
    if the message starts with 2 -> print 'success'
    if the message starts with 3 -> print 'redirect'
    if the message starts with 4 -> print 'client error'
    if the message starts with 5 -> print 'server error'
    */

    val response = 404;

    if (response in 100..199) { // or (response / 100 == 1) *stars with 1
        println("information response")
    } else if (response in 200..299) {
        println("success")
    } else if (response in 300..399) {
        println("redirect")
    } else if (response in 400..499) {
        println("client error")
    } else if (response in 500..599) {
        println("server error")
    }
}