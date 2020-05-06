package Lesson16Expressions

fun main(args: Array<String>) {
    if (326 / 72 * 15 + 93 % 13 == 65) {
        println("Math is hard")
    } else {
        println("Math is fuck you")
    }

    val haveCat = true;
    val haveCatFood = false;

    if (haveCat && haveCatFood) {
        println("feed the damn cat")
    } else {
        println("oh no")
    }

    val age = 13
    if (age >= 18) println("Can drink alcohol") else println("can't drink alcohol")
}