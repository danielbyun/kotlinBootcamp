package Lesson3NumbersAndVariables

fun main(args: Array<String>) {
    /*
     * Ask the user to input a number and read it into a variable
     * convert it to an integer.
     * multiply that value with a double variable that you created
     * what is the type of the new variable?
     * Print it to the console
     */

    println("Give me a number");
    val userInput = readLine() ?: "";
    if (userInput.isNotEmpty() && userInput.isNotBlank()) {
        val userNumber = userInput.toIntOrNull();
        val myDouble = 2.99;
        if (userNumber !== null) {
            val result = userNumber * myDouble
            println("result: $result");
            println("result type: ${result::class.java}")
        } else {
            throw error("You didn't provide a number")
        }
    } else {
        throw error("You didn't provide a number");
    }
}