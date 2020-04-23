package Lesson8Nullability.ElvisOperator

fun main(args: Array<String>) {
    // ?:
    val catName: String? = null;
    println(catName ?: "This cat has no name")
}