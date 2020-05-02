package Lesson15IfConditional

fun main(args: Array<String>) {
    /*
    * A car can only start if the driver has the keys with them.
    * Ask the user to input whether or not they have the keys, as a boolean.
    * Create a program that starts a car based on the user input.
    *
    * Alternatively, ask the user to enter yes or no.
    * Convert that to a boolean and start the car
    * */

    println("Do you have your car keys? yes / no")
    val userInput = readLine() ?: "";
    val hasKeys = userInput.toLowerCase() == "yes";

    if (hasKeys) {
        println("Starting car....")
    } else {
        println("Please find your keys.")
    }

    /*
    * Ask the user to input the current time, only the hour.
    * If it's before twelve, print 'hour' am
    * if it's after, print ('hour'-12) pm
    * */

    println("Please enter the hour of your current time. 24 hour format");
    val hourInput = readLine() ?: "0";
    val hour = hourInput.toInt();

    when {
        hour > 12 -> {
            println("(\'hour\' - ${hour - 12}) pm")
        }
        hour == 12 -> {
            println("(\'hour\' - $hour) pm")
        }
        else -> {
            println("(\'hour\' - $hour) am")
        }
    }
}