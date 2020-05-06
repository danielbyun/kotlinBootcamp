package Lesson16Expressions

fun main(args: Array<String>) {
    val favoritePet = "dog"
    val availablePets = listOf("dog", "cat", "horse")

    if (favoritePet in availablePets) {
        println("We have your next best friend")
    } else {
        println("Sorry, $favoritePet is not available")
    }

    println("What coffee do you like")
    val coffee = readLine() ?: "";

    val availableCoffees = listOf("cappuccino", "mocha")
    if (coffee !in availableCoffees) println("Your coffee is not available")

    println("Enter a number")
    val input = readLine() ?: "0";
    val number = input.toInt()

    if (number !in 0..9) println("your number is not a single digit");
}