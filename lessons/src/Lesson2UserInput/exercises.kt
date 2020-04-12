package Lesson2UserInput

fun main(args: Array<String>) {
    // write a program that asks the user for a number and prints out that number multiplied by 5
    println("please enter a number")
    val userNum = readLine() ?: "";
    val numToInt = userNum.toInt();
    println("result: ${numToInt * 5}");

    // exercise: getting user input
    // create a program that asks a user's birth year
    // then print out the user's estimated age
    println("What's your birth year?");
    val userInput = readLine() ?: "";
    val currentYear = 2020;
    val userBirthYear = userInput.toInt();
    println("You are ${currentYear - userBirthYear} years old.")
}