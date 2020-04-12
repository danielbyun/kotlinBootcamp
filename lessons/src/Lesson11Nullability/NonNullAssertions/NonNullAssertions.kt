package Lesson11Nullability.NonNullAssertions

fun main(args: Array<String>) {
    var catName: String? = null;
    catName = "eivis";
    println(catName.length);

    // if the value is null, the program will crash
}