package Lesson12SetAndHashSet

fun main(args: Array<String>) {
    val numbers = setOf(6, 37, 6, 42);
    println(numbers)

    val emptySet = setOf<Int>();

    val setWithNull = setOf(6, 5, 2, null, 8, 5, 7, null, 4, null);
    println(setWithNull);
}