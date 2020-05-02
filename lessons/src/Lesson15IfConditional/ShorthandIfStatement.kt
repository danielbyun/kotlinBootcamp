package Lesson15IfConditional

fun main(args: Array<String>) {
    val number = 25;
    var isEven: String? = null;
    if (number % 2 == 0)
        isEven = "Number is even";
    else
        isEven = "Number is odd"

    if (number % 2 == 0) isEven = "Number is even" else isEven = "Number is odd";

    isEven = if (number % 2 == 0) "Number is even" else "Number is odd";
}