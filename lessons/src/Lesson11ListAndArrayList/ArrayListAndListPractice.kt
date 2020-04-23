package Lesson11ListAndArrayList

fun main(args: Array<String>) {
    // 1
    // create a list of your favorite animals
    // print out how many animals you have in your list
    // print out the second element in that list.
    val animals = arrayListOf("ferrets", "parrots", "carrots")
    println(animals.size)
    println(animals[1])

    // 2
    // create an arraylist of customers to your online store and add some customers
    // a new customer has signed up, add them to the list
    // a customer has chosen to close their account. remove them from the list
    val customers = arrayListOf("Patrick", "Aaron", "Matthew", "Kristen", "Lauren", "Allie");
    println("True og customers $customers")
    val newCustomer = "Christian";
    customers.add(newCustomer);
    println("customers with new customer added in: $customers");
    customers.removeAt(0);
    println("Patrick has unfortunately decided to close the account: $customers")

    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone");
    val removedItems = listOf("pen", "paper", "mug", "phone");

    items.removeAll(removedItems);

    println(items)
}