package Lesson17WhenConditional

fun main(args: Array<String>) {
    /*
        Assume that 3 meals a day is the recommended amount
        Ask the user to input the number of meals they have every day
        Based on the input, print out a message that encourages the user to increase or decrease the number of meals they have.
    */

    val recommendedNumberOfMeals = 3;

    println("How many number of meals do you have every day?")
    val userInput = readLine() ?: "0";
    val numberOfMeals = userInput.toInt();
    var message = "";

    message = when {
        numberOfMeals > recommendedNumberOfMeals -> "Decrease by ${numberOfMeals - recommendedNumberOfMeals}"
        numberOfMeals in 0..2 -> "Increase by ${recommendedNumberOfMeals - numberOfMeals}"
        else -> "I dont know what you just put in"
    }

    println(message);

    /*
        Assuming, based on the hour of the day

        6 to 11 -> morning
        12 to 14 -> noon
        15 to 17 -> afternoon
        18 to 21 -> evening
        22 to 5 -> night

        ask the user to input the current hour
        print out the message to specify the time of day
    */

    println("Input the current hour")
    val userHour = readLine() ?: "0"
    val hour = userHour.toInt()
    var hourOfDay = ""

    hourOfDay = when (hour) {
        in 6..11 -> "morning"
        in 12..14 -> "noon"
        in 15..17 -> "afternoon"
        in 18..21 -> "evening"
        in 22..24 -> "night"
        in 1..5 -> "night"
        else -> "wtf"
    }

    println(hourOfDay);
}