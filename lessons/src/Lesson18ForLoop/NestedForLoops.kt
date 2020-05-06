package Lesson18ForLoop

fun main(args: Array<String>) {
    println("============================================================")
    // printing a matrix (table)
    for (i in 1..5) {
        for (j in 1..5) {
            print("$i, $j\t")
        }
        println()
    }
    println()
    println("============================================================")
    println()

    val matrixSize = 6;
    for (i in 0..matrixSize) {
        for (j in 0..matrixSize) {
            if (i == j)
                print("diagonal\t")
            else
                print("$i, $j\t\t")
        }
        println()
    }
}
