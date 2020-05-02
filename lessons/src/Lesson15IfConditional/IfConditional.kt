package Lesson15IfConditional

fun main(args: Array<String>) {
    println("is it night where you are?");
    val userInput = readLine() ?: "true";
    var night = "";
    night = if (userInput == "yes") {
        "true";
    } else {
        "false";
    }

    if (night.toBoolean()) {
        println("sleep")
    } else {
        println("be active bish")
    }

    var clientFunds = 100;
    val price = 50;
    var clientProducts = 0;

    if (clientFunds > price) {
        clientFunds -= price;
        clientProducts++;

        println("how much left: $clientFunds")
        println("how many products $clientProducts")
    } else {
        println("You have insufficient funds")
    }
}