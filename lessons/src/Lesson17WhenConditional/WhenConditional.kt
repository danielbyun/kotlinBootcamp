package Lesson17WhenConditional

fun main(args: Array<String>) {
    val animal = "cat"
    var action: String = "";

    when (animal) {
        "cat" -> {
            action = "walk"
        }
    }

    var result = ""
    val number = 2345
    when (number % 2) {
        0 -> result = "number is even"
        1 -> result = "number is odd"
    }

    println(result);
}