package Lesson12Exceptions

import java.lang.Exception
import java.lang.IllegalStateException

fun main(args: Array<String>) {
    /*
        - Read data from the console and convert it into a number
        - if possible, multiply by 5 and print
        - if an exception occurs, catch it and print a meaningful message
    */

    println("write something");
    val userInput = readLine() ?: "";
    val userInputIntoNumber = userInput.toIntOrNull()

    try {
        if (userInputIntoNumber != null) {
            println("result ${userInputIntoNumber * 5}")
        } else {
            println("null")
            throw IllegalStateException("null");
        }
    } catch (e: Exception) {
        e.printStackTrace();
        println(e.localizedMessage);
        throw IllegalStateException("not a number");
    } finally {
        println("cleanup")
    }

    /*
        - the user ,ust input how many kilometers they ran today
        - convert that value to miles
        - handle any exceptions
        - 1 kilometer = 0.62 miles
    */
    try {
        println("How many kilometers did you run today?");
        val userKilometers = readLine() ?: "";
        val userKilometersInt = userKilometers.toInt();
        val userKilometersInMiles = userKilometersInt * 0.62;

        println("You ran $userKilometersInMiles miles today.")
    } catch (e: Exception) {
        e.printStackTrace();
        throw IllegalStateException("Something went wrong")
    } finally {
        println("clean up")
    }

    println("teacher solution")
    println("How many kilometers did you run today?");
    val input = readLine();
    try {
        val distanceKm = input?.toDouble();
        println("$distanceKm km is ${distanceKm?.times(0.62)} miles")
    } catch (e: Exception) {
        println("Cannot read distance")
        e.printStackTrace();
    }
}