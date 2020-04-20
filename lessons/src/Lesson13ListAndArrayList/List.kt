package Lesson13ListAndArrayList

fun main(args: Array<String>) {
    // creating a list
    val colors = listOf("blue", "red", "yellow");

    println(colors)

    val cars = listOf<String>();
    println(cars)

    val colors2 = listOf("blue", "red", "green", "blue");
    println(colors2)

    val colorsWithNull = listOf("blue", "red", "green", "blue", null);
    println(colorsWithNull)

    // since immutable, cannot add or remove an element from the list
    println(colors[0]);
    println(colors.size);
}