package lesson_10

import kotlin.random.Random

fun main() {
    val playerPoints = generatingPoints()
    val computerPoints = generatingPoints()

    printGameResult(playerPoints, computerPoints)
}

fun generatingPoints() = (1..6).random()

fun printGameResult(playerPoints: Int, computerPoints: Int) {
    val result = when {
        playerPoints > computerPoints -> "Победило человечество"
        playerPoints < computerPoints -> "Победила машина"
        else -> "Ничья"
    }
    println(
        """
        Игрок бросил кости - выпало $playerPoints
        Компьютер бросил кости - выпало $computerPoints
        $result
    """.trimIndent()
    )
}

