package Lesson10LogicalOperators

fun main(args: Array<String>) {
    /*
    * is the expression 5.374 * 9.5847
    * greater than
    * 3.237 * 15.3726
    * */

    val firstExpression = 5.374 * 9.5847;
    val secondExpression = 3.237 * 15.3726;

    println(firstExpression > secondExpression);

    // is this expression true or false
    // ((true && false) || (true || false))
    println(((true && false) || (true || false)))

    val expression4 = !(3 >= 3) && (false || (2 < 5))
    println(expression4)

    /*
    * a child has two toys, of which one is broken.
    * the parents will only buy a new toy if he has less than 5 and at least one is not broken.
    * will the child get a new toy?
    * */
    val toys = 2;
    val brokenToys = 1;

    if (toys < 5 && brokenToys >= 1) {
        println("new toy!")
    }

    /*
    * A farmer has 3 cows, of which only one produces milk
        He has two children
        He is trying to apply for funding. The requirements are
        You must have no more than 5 animals
        Animals must produce something that can be sold
        Regardless of the other conditions, funding will be approved if the family has 3 or more members
        Does the farmer receive the funding?
    * */
    val cows = 3;
    val cowsThatProduceMilk = 1;
    val children = 2;
    val expression = cows < 5 && cowsThatProduceMilk > 0 || children + 1 >= 3
    println("Will this farmer receive the funding? $expression")
}