package Lesson13MapAndHashMap

fun main(args: Array<String>) {
    // ========== map ==========
    // initializing map
    val count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(count)

    // specifying empty map
    val emptyMap = mapOf<Int, String>();
    println(emptyMap)

    // get a value based on a key
    println(count[2])

    // get the whole set of keys (they are unique)
    println(count.keys)

    // get the whole set of values (they don't have to be unique)
    println(count.values)

    // ======== hashmap ========
    // initializing
    val hashCount = hashMapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"));
    // adding a key-value pair
    println("\nadd one")
    hashCount[4] = "four";
    println(hashCount)

    // add another hashmap
    println("\nadd another hashmap collection")
    val hashCountToAdd = hashMapOf(Pair(6, "six"), Pair(7, "seven"), Pair(10, "ten"));
    hashCount.putAll(hashCountToAdd);
    println(hashCount);

    // remove an element
    println("\nremove an element")
    hashCount.remove(2)
    println(hashCount)

    // replace a value
    println("\nreplace a value")
    hashCount.replace(3, "three", "3")
    println(hashCount)

    // remove all elements
    println("\nremove all elements")
    hashCount.clear();
    println(hashCount)
}