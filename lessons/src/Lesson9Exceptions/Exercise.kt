package Lesson9Exceptions

import java.lang.IllegalStateException

fun main(args: Array<String>) {
    /*
    * a customer will tell the program what product they want to buy.
    * Then, they will tell the program how many products they require.
    * Assume the price of the product is 9.99
    * what is the total?
    *
    * handle exceptions.
    * */

    println("What do you want to buy today, shoes or jackets");
    val userInput = readLine();
    try {
        when {
            userInput.equals("shoes") -> {
                val shoePrice = 9.99;
                println("How many shoes do you want to buy?");
                val shoeQuantity = readLine();
                val shoeQuantityToInt = shoeQuantity?.toInt()

                println("cool, your total is ${shoeQuantityToInt?.times(shoePrice)}")
            }
            userInput.equals("jackets") -> {
                val jacketPrice = 49.99;
                println("How many jackets do you want to buy?");
                val jacketQuantity = readLine();
                val jacketQuantityToInt = jacketQuantity?.toInt();

                println("cool, your total is ${jacketQuantityToInt?.times(jacketPrice)}")
            }
            else -> {
                throw IllegalStateException("you d`idnt choose any of the categories available")
            }
        }
    } catch (e: Exception) {
        println("You didn't choose any");
        e.printStackTrace();
        throw IllegalStateException("something went wrong")
    } finally {
        println("closing shop")
    }
}