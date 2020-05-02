package Lesson15IfConditional

fun main(args: Array<String>) {
    /*
    * If you find eggs, buy 12
    * I you buy eggs and you also find bacon, buy two packs
    *
    * eggs cost 5 each
    * a pack of bacon costs 20
    *
    * how much doest he man spend at the market?
    * */

    val hasEggs = true
    val hasBacon = false

    val storeItems = listOf("Eggs", "Bacon");
    val newStoreItems = storeItems.map { item -> item.toLowerCase() }

    val eggCost = 5;
    val bacon = 20;
    val numberOfEggsToPurchase = 5;

    var total = null ?: "";

    println(storeItems)
    println(newStoreItems)

    if (newStoreItems.contains("eggs") && newStoreItems.contains("bacon")) {
        total += (eggCost * numberOfEggsToPurchase) + (bacon * 2);
        println(total)
    }
}