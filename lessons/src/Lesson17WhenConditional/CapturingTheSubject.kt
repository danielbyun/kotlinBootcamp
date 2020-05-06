package Lesson17WhenConditional

fun main(args: Array<String>) {
    val name = "Michelle"
    when(val length = name.length) {
        in 1..5 -> println("this name: $name has a short, $length of characters")
        in 6..10 -> println("this name: $name has a medium, $length of characters")
       else -> println("this name: $name has a long, $length of characters")
    }
}