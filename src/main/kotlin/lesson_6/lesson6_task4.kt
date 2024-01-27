package lesson_6

fun main() {
    println("Попробуйте угадать число от 1 до 9. У вас есть 5 попыток")
    var attempts = 5
    val rightNumber = 7

    while (attempts > 0) {
        val userNumber = readln().toInt()
        if (userNumber == rightNumber) {
            println("Это была великолепная игра!")
            break
        }
        println("Не угадали. Осталось попыток: ${--attempts}")

        if (attempts == 0) {
            println("Было загадано число $rightNumber")
        }
    }
}