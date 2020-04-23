package Lesson10ResultTypes

fun main(args: Array<String>) {
    val dozen = 12;
    val months = dozen;
    println(months);

    val userName = "Stacy";
    val greeting = "Hello, $userName";
    println(greeting)

    val price = 3.99;
    val numberOfItems = 3;

    println("the total is: ${price * numberOfItems}")
}