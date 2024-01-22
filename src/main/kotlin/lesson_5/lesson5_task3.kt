package lesson_5

fun main() {
    val firstNumber = 34
    val secondNumber = 40
    val numbersList = listOf(firstNumber, secondNumber)

    println("Попробуйте угадать два числа в диапазоне от 0 до 42!\nВведите первое число:")
    val firstUserValue = readln().toInt()

    println("Введите второе число:")
    val secondUserValue = readln().toInt()

    val victoryCondition = numbersList.contains(firstUserValue) && numbersList.contains(secondUserValue)
    val consolationPrize = numbersList.contains(firstUserValue) || numbersList.contains(secondUserValue)

    if (victoryCondition) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (consolationPrize) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Нужные для победы числа: $firstNumber и $secondNumber")
}