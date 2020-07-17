package Lesson19WhileLoop

fun main(args: Array<String>) {
    val puzzlePieces = 20
    var piecesPlaced = 0

    while (piecesPlaced < puzzlePieces) {
        println("Piece placed $piecesPlaced")
        piecesPlaced++
    }
}