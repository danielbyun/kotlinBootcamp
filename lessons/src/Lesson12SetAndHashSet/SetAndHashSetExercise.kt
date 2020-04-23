package Lesson12SetAndHashSet

fun main(args: Array<String>) {
    // you have a list of customers for your online store
    val customers = hashSetOf("Frank", "Clarke", "Andy", "Jim", "Michael");
    println(customers);
    // a new customer has joined
    customers.add("Meredith");
    // print the list of customers
    println(customers);
    // a customer has chosen to leave
    customers.remove("Frank");
    // print the list of customers
    println(customers)
}