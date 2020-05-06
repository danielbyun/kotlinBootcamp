package Lesson16Expressions

fun main(args: Array<String>) {
    val animals = arrayListOf<String>();

    if (animals.isEmpty()) {
        animals.add("dog");
    }

    println(animals);

    if (animals.add("horse")) {
        println("Horse was successfully added")
    }
}