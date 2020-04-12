package Lesson3NumbersAndVariables

fun main(args: Array<String>) {
    // create an int variable and print it
    // confirm by printing its class
    val newInt = 32;
    println(newInt);
    println(newInt::class.java);

    println("========================")

    val newLong = 239587239293847234;
    println(newLong);
    println(newLong::class.java)

    println("========================")

    val newDouble = 32.99;
    println(newDouble);
    println(newDouble::class.java)

    println("========================")
}