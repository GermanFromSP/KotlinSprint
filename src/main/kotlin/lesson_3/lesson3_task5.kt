package lesson_3

fun main() {
    val userMove = "D2-D4;0"
    val from: String
    val to: String
    val moveCount: Int

    val partOfMove = userMove.split("-", ";").also {
        from = it[0]
        to = it[1]
        moveCount = it[2].toInt()
    }

    println(
        """
        $from
        $to
        $moveCount
    """.trimIndent()
    )
}