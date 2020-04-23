package Lesson12SetAndHashSet

fun main(args: Array<String>) {
    val acceptedColors = hashSetOf("white", "black", "grey");
    var myColors = hashSetOf("blue", "red", "black", "green")

    myColors.retainAll(acceptedColors)
    println("I can currently wear clothes that have the following colors: $myColors\n");

    myColors = hashSetOf("blue", "red", "black", "green")
    acceptedColors.add("red");
    myColors.retainAll(acceptedColors);
    println("After updating the company's available colors, I can now wear these following colors: $myColors")
}