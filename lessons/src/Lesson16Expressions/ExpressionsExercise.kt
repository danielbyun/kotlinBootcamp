package Lesson16Expressions

fun main(args: Array<String>) {
    /*
    Ask a user to input their age

    If they are under 13, they are a child
    If they are under 18, they are a teen
    If they are older, they are an adult

    use ranges to print out the correct message.

    If the age is 0, convert it to 1.
    */

    println("How old are YOU")
    val userInput = readLine() ?: "0";
    var userAge = userInput.toInt();
    var message = "";

    when {
        userAge == 0 -> userAge = 1
        userAge < 13 -> message = "You are a child"
        userAge in 14..18 -> message = "You are in your teens"
        userAge > 18 -> message = "You are an adult"
    }

    println(message);
}