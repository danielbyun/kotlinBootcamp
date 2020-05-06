package Lesson18ForLoop

fun main(args: Array<String>) {
    for (i in 1..3) {
        println("Strike $i")

        if (i == 3) {
            println("You're out")
        }
    }

    for (i in 10 downTo 0 step 2) {
        println("$i ...")

        if (i == 0) {
            println("FIRE")
        }
    }

    for (i in 10 downTo 0) {
        println(i)
        when(i) {
            9 -> println("Start your engines")
            6 -> println("On your marks")
            3 -> println("Get set")
            0 -> println("go")
        }
    }
}