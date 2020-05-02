package Lesson15IfConditional

fun main(args: Array<String>) {
    /*
        You are designing a grading system for school exams.
        The total for an exam is 100 points, and you need to convert that into a grade A to F.

        Design a program that reads in a number that represents a student’s grade, from 1 to 100 and prints out a grade.

        A -> 90 to 100
        B -> 80 to 89
        C -> 70 to 79
        D -> 60 to 69
        E -> 50 to 59
        F -> everything else
    */

    println("What grade did the student receive? \nInput the grade number 1-100")
    val userInput = readLine() ?: ""
    val studentGrade = userInput.toInt()
    var message = ""

    if (studentGrade > 100) {
        message = "too big of a number"
    } else if (studentGrade < 0) {
        message = "not real"
    }

    when (studentGrade) {
        in 90..100 -> message = "The student received an A"
        in 80..89 -> message = "The student received a B"
        in 70..79 -> message = "The student received a C"
        in 60..69 -> message = "The student received a D"
        in 50..59 -> message = "The student received an E"
        in 1..49 -> message = "The student received an F"
    }

    println(message)
}