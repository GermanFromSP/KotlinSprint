package lesson_6

fun main() {
    var attempts = 3

    println("Докажите, что вы не бот. У вас 3 попытки")

    while (attempts > 0) {

        --attempts
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()

        println("$firstNumber + $secondNumber = ")
        val userSum = readln().toInt()

        if (userSum == (firstNumber + secondNumber)) {
            println("Добро пожаловать!")
            break
        } else if (attempts == 0) {
            println("Доступ запрещен")
            break
        } else {
            println("Неверно! Осталось попыток: $attempts")
        }

    }
}
