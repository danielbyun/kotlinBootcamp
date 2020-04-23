package Lesson12SetAndHashSet

fun main(args: Array<String>) {
    // exercise 1
    // Create an empty set of String colors
    val colors = hashSetOf<String>();
    // Add three colors
    val newColors = setOf("yellow", "red", "orange");
    colors.addAll(newColors);
    // Remove one
    colors.remove("red");
    // Print out the result
    println(colors);

    // exercise 2
    // create a set of the objects that are on your desk at the moment
    val shitOnMyDesk = hashSetOf("Computer", "Charger", "Mask", "Phone", "Gum", "FUCKKKKKKKKKKK");
    // create another set of the objects that you would remove if you were to clean your desk
    val getTheseShitsOffMyDesk = setOf("Gum");
    val result = shitOnMyDesk.removeAll(getTheseShitsOffMyDesk)
    // print out the items that would remain
    println("Shit on my desk: $shitOnMyDesk");


    // you have a set of the first 10 prime numbers
    val primeNumbers = setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    // is the number 21 a prime number? print out the result
    println("is 21 a prime number? ${primeNumbers.contains(21)}")
    // is the number 13 a prime number? print out the result
    println("is 13 a prime number? ${primeNumbers.contains(13)}")

    // your favorite drinks are
    val myFavoriteDrinks = hashSetOf("water", "coke", "beer", "apple juice");
    // your partner's favorite drinks are
    val theirFavoriteDrinks = hashSetOf("water", "orange juice", "tequila", "milk");
    // if you want to buy a drink that you both can enjoy, what are the options you have? print the result
    myFavoriteDrinks.retainAll(theirFavoriteDrinks);
    println("we can both enjoy: $myFavoriteDrinks")
}