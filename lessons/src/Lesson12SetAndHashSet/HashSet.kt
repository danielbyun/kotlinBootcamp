package Lesson12SetAndHashSet

fun main(args: Array<String>) {
    val numbers = hashSetOf(3, 6, 4, null);
    val noNumbers = hashSetOf<Int>();

    val newNumbers = hashSetOf(null, 5, 3, 2, 34, 34);

    numbers.add(44);

    println(numbers);
    numbers.addAll(newNumbers);
    println(numbers);

    val toRemove = setOf(3, 5, 8574);
    numbers.removeAll(toRemove);

    println(numbers);
}