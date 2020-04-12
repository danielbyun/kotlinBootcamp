package Lesson6StringsPart2

fun main(args: Array<String>) {
    println("Please enter a number");
    val numberInput = readLine() ?: "";

    val myByte = numberInput.toByte();
    println(myByte);
    println(myByte::class.java)

    val myShort = myByte.toShort();
    println(myShort);
    println(myShort::class.java)

    val myInt = numberInput.toInt();
    println(myInt::class.java)

    val myLong = numberInput.toLong();
    println(myLong::class.java)

    val myFloat = numberInput.toFloat();
    println(myFloat::class.java);

    val myDouble = numberInput.toDouble();
    println(myDouble::class.java);
}