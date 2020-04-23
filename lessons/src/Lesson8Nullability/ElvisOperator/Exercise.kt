package Lesson8Nullability.ElvisOperator

fun main(args: Array<String>) {
    val product = 29.99;
    println("How many do you wanna buy?");
    val quantity = readLine()
    val userQuantity = quantity?.toInt() ?: 1

    println("The Total is: ${product * userQuantity}")
}