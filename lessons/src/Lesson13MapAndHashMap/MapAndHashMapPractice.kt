package Lesson13MapAndHashMap

fun main(args: Array<String>) {
    // ========== exercise 1 ==========
    // you have the following translation of numbers in french
    val count = hashMapOf(Pair(1, "un"), Pair(2, "deux"), Pair(3, "trois"))

    // print out how you would translate 2
    println("The French translation for 2 is: ${count[2]}")

    // same for 3
    println("\nThe French translation for 3 is: ${count[3]}")

    // add the translation for 4 => "quatre"
    println("\nAdding the French translation for 4...")
    count[4] = "quatre"
    println("count 4: ${count[4]} added")

    // print out the whole map
    println("\nNew translations: $count")

    // ========== exercise 2 ==========
    val customers = mapOf(Pair("John", 1), Pair("Alice", 5), Pair("Bob", 3));
    println("\nCustomers: $customers")

    // is alice a customers? how many products did she buy?
    println("Is \"Alice\" a customer? ${customers.containsKey("Alice")}")
    println("Alice bought ${customers["Alice"]}")
    // is michael a customer?
    println("Is \"Michael\" a customer? ${customers.containsKey("Michael")}")
}