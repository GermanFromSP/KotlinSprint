package lesson_3

fun main() {
    var from = "E2"
    var to = "E4"
    var movesCount = 1

    println("Black move: from $from to $to, $movesCount move")

    from = "B7"
    to = "B5"
    movesCount++

    println("White's move: from $from to $to, $movesCount move")

    from = "D2"
    to = "D3"
    movesCount++

    println("Black move: from $from to $to, $movesCount move")
}