package Lesson5TypeConversions

fun main(args: Array<String>) {
    val cats = 3;
    val longCats = cats.toLong();

    println(cats::class.java);
    println(longCats::class.java)
}