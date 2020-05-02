package Lesson15IfConditional

fun main(args: Array<String>) {
    val animal = "";

    val action = if (animal == "dog") {
        "pet it";
    } else if (animal == "cat") {
        "feed it"
    } else if (animal == "crocodile") {
        "run away"
    } else {
        "google it";
    }

    println(action)
}