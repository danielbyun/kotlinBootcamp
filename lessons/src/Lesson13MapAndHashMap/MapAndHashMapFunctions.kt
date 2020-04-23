package Lesson13MapAndHashMap

fun main(args: Array<String>) {
    val count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))

    // size
    println("count size")
    println("This map has a size of: ${count.size}")

    println("\nsearch key: \nDoes this map have the key \"2\": ${count.containsKey(2)}")
    println("\nsearch value: \nDoes this map have the value \"two\": ${count.containsValue("two")}")

    println("\nIs the map empty: ${count.isEmpty()}")
    println("\nDoes this map have any key value pairs?: ${count.isNotEmpty()}")
}