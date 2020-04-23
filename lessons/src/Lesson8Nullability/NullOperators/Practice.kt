package Lesson8Nullability.NullOperators

fun main(args: Array<String>) {
    /*
    * Declare a nullable variable of type String and give it a value.
    * Print out a substring of it, from position 3 to 6
    */

    val nullString: String? = "null Value";
    val subtracted = nullString?.substring(3, 6);
    println("Substring: $subtracted")

    /*
    * Declare a nullable value of type Double
    * multiply it by 6, convert it to a float and print it to the console
    */

    val nullDouble: Double? = 4.2069;
    val result = nullDouble?.times(69)?.toFloat();
    println("Double -> Float: $result")

    /*
    * Receive the name of the user from the console
    * Print out the length of the name
    */
    println("whats your name, dummy")
    val userName = readLine() ?: ""
    val userNameLength = userName.length;

    println("userNameLength: $userNameLength")
}