package Lesson8Nullability.NullOperators

fun main(args: Array<String>) {
    var catName: String? = "Chonker";
    println(catName?.length.toString());
    catName = null;
    println(catName?.length?.toString());

    // arithmetic
    val a: Int? = 10;
    val b = a?.plus(3);
    val c = a?.minus(2);
    val d = a?.times(2);
    val e = a?.div(1);
    val f = a?.rem(1)

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
}
