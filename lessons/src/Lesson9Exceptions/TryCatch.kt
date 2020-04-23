package Lesson9Exceptions

fun main(args: Array<String>) {
    println("write literally anything")
    val test = readLine();
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        e.printStackTrace();
        println("There was an error: \n${e.localizedMessage}")
    }
}