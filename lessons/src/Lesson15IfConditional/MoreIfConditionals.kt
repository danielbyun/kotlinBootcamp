package Lesson15IfConditional

fun main(args: Array<String>) {
    val petStore = listOf("Cat".toLowerCase(), "Dog".toLowerCase(), "rabbit".toLowerCase())
    val hasCatFood = true;

    if (petStore.contains("cat")) {
        if (hasCatFood) {
            println("Buy cat and cat food")
        } else {
            println("Adopt cat")
        }
    } else {
        println("complain like a karen that the petstore doesn't have cats")
    }
}