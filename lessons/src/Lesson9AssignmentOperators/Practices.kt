package Lesson9AssignmentOperators

fun main(args: Array<String>) {
    // two variables
//    val a = 76.254;
//    val b = 3.867;

    // calculate and print out
    /*
    * 1) addition
    * 2) subtraction
    * 3) multiplication
    * 4) division
    * 5) remainder
    * */

//    println("addition: ${a + b}");
//    println("subtraction: ${a - b}")
//    println("multiplication: ${a * b}");
//    println("division: ${a / b}");
//    println("remainder: ${a % b}");

    // kilo of meat cost = 29.99
    // buy a third of kilo
    // how much is the cost?
//    val kiloMeat = 29.99;
//    val purchaseAmount = (1F / 3);
//    println(kiloMeat * (purchaseAmount));

    /*
     * Read from the console the amount the user has in their bank account
     * They have just won a contest that tripes their amount.
     * How much does the user have?
     */
//    println("How much do you have");
//    val userInput = readLine() ?: "";
//    println("You said you have $userInput, but congratulations, you won this stupid contest, and now we will triple your amount!")
//    val tripleAmount = userInput.toDouble() * 3;
//    println("You will not have $tripleAmount")

    /*
    * 1) get the amount from the user's bank account
    * 2) the interest on that account is 5.5% per year
    * 3) how much would that user have in 5 years?
    *
    *
    * */
    println("How much do you have");
    val userAmountInBank = readLine() ?: "";
    val interest = 1.055
    println("In 5 years, you will have ${userAmountInBank.toFloat() * interest * interest * interest * interest * interest}")
}