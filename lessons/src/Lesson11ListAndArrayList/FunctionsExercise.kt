package Lesson11ListAndArrayList

fun main(args: Array<String>) {
    val animals = arrayListOf("Lion", "Zebra", "Chimp", "Elephant");
    // a new panda bear cub has arrived
    val newPanda = "Panda Bear Cub";
    animals.add(newPanda);
    // print out the new list of animals
    println(animals);
    // the lion has been sold to a different zoo
    animals.removeAt(animals.indexOf("Lion"));
    // print the new list of animals
    println(animals);
    // does the zoo have both elephants and giraffes?
    val animalsInQuestion = listOf("Elephants", "Giraffe");
    println("Does the zoo have both elephants and giraffes?: ${animals.containsAll(animalsInQuestion)}")
}