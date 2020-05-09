package Lesson18ForLoop

fun main(args: Array<String>) {
    /*
        Ask the user to input a number. Call it maxValue
        Print out every number smaller than maxValue that is divisible by 7,
        in descending order
    */

    println("Give me a number. Any number.");
    val userInput = readLine() ?: "0";
    val maxValue = userInput.toInt();

    // ascending order
    //    for (i in 0..maxValue) {
    //        if (i % 7 == 0 && i > 0) {
    //            println(i)
    //        }
    //    }

    // descending order
    for (i in maxValue downTo 0) {
        if (i % 7 == 0 && i > 0 && i < maxValue) {
            println(i)
        }
    }

    /*
        Replicate this outcome
        😀
        😀😀
        😀😀😀
        😀😀😀😀
        😀😀😀😀😀
        😀😀😀😀😀😀
        😀😀😀😀😀😀😀
        😀😀😀😀😀😀😀😀
        😀😀😀😀😀😀😀😀😀
        😀😀😀😀😀😀😀😀😀😀
    */

    val maxSize = 10;
    for (i in 1..maxSize) {
        // the value = { i } will be the number of smiley emojis
        for (j in 1..i) {
            print("\uD83D\uDE00")
        }
        println()
    }
}