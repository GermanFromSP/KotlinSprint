package lesson_7

fun main() {
    val alphabet = ('a'..'z').toList()
    val numbers = (1..9).toList()
    var password = ""

    println("Давайте сгенерируем вам пароль!\nВведите длину пароля (минимум 6 символов):")
    val passwordSize = readln().toInt()

    for (i in 1..passwordSize) {
        val randomNumber = (0..99).random()

        when (randomNumber) {
            in 0..30 -> password += alphabet[alphabet.indices.random()]
            in 30..60 -> password += alphabet[alphabet.indices.random()].uppercaseChar()
            else -> password += numbers[numbers.indices.random()]
        }
    }

    println(password)
}