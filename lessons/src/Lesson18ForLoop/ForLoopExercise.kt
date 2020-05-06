package Lesson18ForLoop

fun main(args: Array<String>) {
    /*
        Ask the user to input a year. For each month of that year, print out how many days there are.
        Make sure you count leap years.
        Assume a leap year is a year that is divisible by 4.
    */
    println("Input the year")
    val userInput = readLine() ?: "2020";
    val userYear = userInput.toInt()

    val months = listOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

    for (month in months) {
        val days = when (month) {
            "January", "March", "May", "July", "August", "October", "December" -> 31
            "February" -> if (userYear % 4 == 0) 28 else 29
            else -> 30
        }
        println("In year $userYear, $month has $days days")
    }
}