package Lesson12SetAndHashSet

fun main(args: Array<String>) {
    val numbers = setOf(3, 6, 4, null, 3);
    println(numbers.size)
    println(numbers.contains(3));

    val newNumbers = setOf(835739, 3);
    println(numbers.containsAll(newNumbers)) // false

}