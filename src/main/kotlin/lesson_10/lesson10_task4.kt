package lesson_10

private const val POSITIVE_RESPONSE = "Да"

fun main() {
    var gamesWon = 0
    var userResponse = POSITIVE_RESPONSE

    while (userResponse == POSITIVE_RESPONSE) {
        if (holdingRound(generatePoints(), generatePoints())) {
            gamesWon++
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        userResponse = readln().replaceFirstChar(Char::titlecase)
    }

    println("Количество выигранных партий: $gamesWon")
}

fun generatePoints() = (1..6).random()

fun holdingRound(humanPoints: Int, computerPoints: Int): Boolean {
    val result = when {
        humanPoints > computerPoints -> "Победило человечество"
        humanPoints < computerPoints -> "Победила машина"
        else -> "Ничья"
    }
    println(
        """
        Игрок бросил кости - выпало $humanPoints
        Компьютер бросил кости - выпало $computerPoints
        $result
    """.trimIndent()
    )
    return result == "Победило человечество"
}