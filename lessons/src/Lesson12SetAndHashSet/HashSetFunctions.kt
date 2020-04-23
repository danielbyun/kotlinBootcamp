package Lesson12SetAndHashSet

fun main(args: Array<String>) {
    val numbers = hashSetOf(3, 4, null, 83, 56);
    val newNumbers = setOf(83, 345, 56);

    numbers.retainAll(newNumbers)
    println(numbers);
}