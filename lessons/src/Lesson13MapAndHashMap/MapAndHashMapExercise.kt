package Lesson13MapAndHashMap

fun main(args: Array<String>) {
    // You manage an amusement park, and you have a map that stores dates and attendance
    val attendance = hashMapOf<String, Int>(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253));

    // add a value for 26 sept
    attendance["26 Sept"] = 8273;

    // how many people attended in total on 25 and 26 sept?
    val firstAttendance = attendance["25 Sept"] ?: 0
    val secondAttendance = attendance["26 Sept"] ?: 0

    println("$firstAttendance + $secondAttendance")
    println("${firstAttendance.plus(secondAttendance)}")

    // is data for 22 sept available?
    println("\nIs there data for 22 Sept")
    println("${attendance.containsKey("22 Sept")}")
}