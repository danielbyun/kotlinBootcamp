package Lesson16Expressions

fun main(args: Array<String>) {
    /*
    A club has a guestlist
    A guest comes and gives them their name (inputs to the console)
    Will the user have access to the club?
    */
    val guestList = arrayListOf("Devon", "Matt", "Chris");

    println("What's your name")

    val guestName = readLine() ?: ""

    if (guestName in guestList) {
        println("Go ahead")
    } else {
        println("youre not on the list")
    }

    /*
    A lady has cats
    1 to 3 -> few cats
    4 to 6 -> several cats
    7 or more -> many cats
    ask the user how many cats they have, then print the appropriate text
    */

    println("How many cats do you have? Type the number 0 - 100");
    val userInput = readLine() ?: "0";
    val numberOfCats = userInput.toInt();
    var message = "";

    when (numberOfCats) {
        in 1..3 -> message = "Few cats";
        in 4..7 -> message = "several cats"
        !in 0..7 -> message = "too many cats"
    }

    println(message);

    /*
        An animal shelter has a list of animals that it tries to get adopted.

        They are trying to print a message, to either advertise available animals
        if there are any animals in the shelter, or thank the community if all
        animals have been adopted.

        Design a program to print out that message.
    */

    val animals = arrayListOf("Dog", "Cat", "Ferret", "Parrot", "Lizard", "Goldfish")

    val animalShelterMessage = if (animals.isEmpty()) {
        "Thank you for finding homes for these beautiful animals!"
    } else {
        "We still have wonderful animals left! Come adopt any of these beautiful animals ${animals.toString()}"
    }

    println(animalShelterMessage)
}