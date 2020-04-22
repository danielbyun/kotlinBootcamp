package Lesson13ListAndArrayList

fun main(args: Array<String>) {
    // this is the list of winners of the men's 100m race
    val winners = listOf("Usain", "John", "Michael", "Alex", "Bob");
    // what place did Michael finish on?

    println("michael finished at: ${winners.indexOf("Michael") + 1} place");

    // A printer needs the colors red, green, and blue to print
    // A printer on your desk has the following colors available.
    val availableColors = listOf("red", "blue");
    // design a program that prints out a boolean value, on whether or not the printer can print;
    println("Can my printer print properly with the colors it has?")
    val neededColors = listOf("red", "blue", "green")
    println(availableColors.containsAll(neededColors));

    // a recipe calls for the following ingredients
    // chicken, egg, mozzarella, pepper
    // you decide to replace the mozzarella with blue cheese
    // print out the list of ingredients
    val ingredients = arrayListOf("chicken", "egg", "mozzarella", "pepper");
    // ingredients.set(ingredients.indexOf("mozzarella"), "blue cheese");
    // ingredients[ingredients.indexOf("mozzarella")] = "blue cheese";
    ingredients[2] = "blue cheese";
    println(ingredients);
}