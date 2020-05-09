package Lesson18ForLoop

fun main(args: Array<String>) {
    /*
        ASK THE USER FOR A NUMBER
        print out a square matrix of the size indicated by the number
        inside each cell, print out 1 emoji

        😀 if the row * column is divisible by 3
        🤨 if the row * column % 3 is 1
        🥶 if the row * column % 3 is 2
    */

    println("GIVE ME A NUMBER BISH");
    val userInput = readLine() ?: "0";
    val userNumber = userInput.toInt();

    for (i in 1..userNumber) {
        for (j in 1..userNumber) {
            when (j * i % 3) {
                0 -> print("\uD83D\uDE00\t")
                1 -> print("\uD83E\uDD28\t")
                2 -> print("\uD83E\uDD76\t")
            }
        }
        println()
    }
}