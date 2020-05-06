package Lesson18ForLoop

fun main(args: Array<String>) {
    // print a greeting message 10 times
    for (i in 0..10) {
        val greeting = when (i) {
            in 1..5 -> "lessgo"
            in 6..10 -> "turd"
            else -> "sup"
        }
        println(greeting)
    }

    // add up all the numbers from 1 to 100
    var point: Int?
    var result = 0;
    for (i in 1..100) {
        point = i + 1
        result += i
    }
    println(result)

    /*
    An online store has the following map of customers and number of purchases

    for each customer, print out a message telling them how much purchases they made.
    */

    val customers = hashMapOf(Pair("Alice", 4), Pair("Paul", 15), Pair("Anna", 200));

    for (customer in customers) {
        println("Customer: ${customer.key} has purchased ${customer.value} items")
    }

    for (customerName in customers.keys) {
        val purchases = customers[customerName];
        println("Customer: $customerName has purchased $purchases items")
    }
}