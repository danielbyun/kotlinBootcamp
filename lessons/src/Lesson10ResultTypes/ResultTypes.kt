package Lesson10ResultTypes

fun main(args: Array<String>) {
    val a: Short = 6;
    val b: Int = 32;
    val r = a * b;
    println(r::class.java);
}