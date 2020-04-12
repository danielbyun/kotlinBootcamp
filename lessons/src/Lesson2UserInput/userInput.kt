package Lesson2UserInput

import kotlin.random.Random

fun main(args: Array<String>) {
    println("Write something");
    val userInput = readLine();
    println("you wrote: $userInput");

    val newInput = readLine() ?: "";
    println("you wrote: $newInput");
    val myNumber = newInput.toInt();

    val randomNum = Random(3);
    println("random Number: ${randomNum.nextInt(3, 10)}")

}