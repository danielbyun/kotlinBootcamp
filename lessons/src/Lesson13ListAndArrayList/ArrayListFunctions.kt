package Lesson13ListAndArrayList

fun main(args: Array<String>) {
    val colors = arrayListOf("blue", "red", "blue", "green");
    colors[1] = "redder";

    println(colors)
    println(colors.subList(1, 3))
    println(colors::class.java)

    colors.clear();
    println(colors)
    println(colors.isEmpty())
}