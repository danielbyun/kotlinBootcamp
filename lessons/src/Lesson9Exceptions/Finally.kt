package Lesson9Exceptions

fun main(args: Array<String>) {
    println("write literally anything")
    val test = readLine();
    try {
        // try to do something
        println(test?.toInt())
    } catch (e: Exception) {
        // if an exception occurs, do this
        e.printStackTrace();
        println("There was an error: \n${e.localizedMessage}")
    } finally {
        // always execute this part
        println("clean up function here")
    }
}