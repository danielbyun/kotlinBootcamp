package Lesson17WhenConditional

fun main(args: Array<String>) {
    val animal = "dog";
    val action = when (animal) {
        "cat" -> "feed it"
        "dog" -> {
            println("this is a dog.")
            "pet it."
        }
        else -> "google it"
    }

    println(action)

    val month = "January"
    val days = when (month) {
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }

    println(days)
}