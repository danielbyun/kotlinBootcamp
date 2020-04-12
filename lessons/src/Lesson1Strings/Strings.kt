package Lesson1Strings

fun main(args: Array<String>) {
    val variable = "sup";
    println("what's good youtube: $variable");

    val myPieceOfShitCatsName = "Fluffy";
    println("My cat's name is \"$myPieceOfShitCatsName\"");

    val google = "http://www.google.com";
    println(google);

    println("   (\\ (\\   ");
    println("   (-. -)  ");
    println("   o_(\")(\") ");

    val user = "john";
    println("Dear $user: fuck you.")

    val apples = 3;
    val oranges = 6;

    println("We have ${apples + oranges} fruits available");

    val client = "Mary";
    val products = 3;
    val price = 30;

    println("Hello $client: you have $${price * products} in debt.")
}