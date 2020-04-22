package Lesson13ListAndArrayList

fun main(args: Array<String>) {
    val colors = listOf("blue", "red", "blue", "green");
    println(colors.size);
    println(colors.contains("red"));
    println(colors.contains("teal"))

    val newColors = listOf("red", "green");
    println(colors.containsAll(newColors));

    println(colors.indexOf("blue"))
    println(colors.lastIndexOf("blue"))
}