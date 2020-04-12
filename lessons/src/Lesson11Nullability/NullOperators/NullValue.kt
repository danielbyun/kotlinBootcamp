package Lesson11Nullability.NullOperators

fun main(args: Array<String>) {
    val herName: String = "Lilly";
    val hisName: String? = null;

    var catName: String? = "Chonkers";
    catName = null;

    // compilation error
    var dogName: String = "good boy";
    // dogName = null;
}
