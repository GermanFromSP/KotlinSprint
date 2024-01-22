package lesson_5

import kotlin.random.Random

private const val SEPARATOR = " "
private const val FIRST_ELEMENT = 1

fun main() {
    val inputNumbers = mutableListOf<Int>()
    val requiredNumbers = listOf(
        Random.nextInt(0, 42),
        Random.nextInt(0, 42),
        Random.nextInt(0, 42)
    )

    println("Попробуйте угадать три числа в диапазоне от 0 до 42!")

    for (i in FIRST_ELEMENT..requiredNumbers.size) {
        println("Введите $i-e число:")
        inputNumbers.add(readln().toInt())
    }

    val coincidences = requiredNumbers.intersect(inputNumbers.toSet()).size

    when (coincidences) {
        3 -> println("Вы угадали все числа и выиграли джекпот! Поздравляем!")
        2 -> println("Вы угадали два числа и выиграли крупный приз!")
        1 -> println("Вы угадали лишь одно число и выиграли утешительный приз.")
        else -> println("Вы не угадали ни одного числа.")
    }

    println("Необходимые числа: ${requiredNumbers.joinToString(SEPARATOR)}")
}