package Lesson13ListAndArrayList

fun main(args: Array<String>) {
    val colors = arrayListOf("blue", "red", "yellow");
    val noColors = arrayListOf<String>();
    val moreColors = arrayListOf("teal", "pink", "green");

    println(colors);

    noColors.add("yo");
    noColors.addAll(moreColors)
    println(noColors)
}