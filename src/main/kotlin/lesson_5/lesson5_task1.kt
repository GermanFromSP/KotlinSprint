package lesson_5

private const val RIGHT_ANSWER = 48

fun main() {

    println("Докажите, что вы не робот.\n17+31=?")
    val userAnswer = readln().toInt()

    if (userAnswer == RIGHT_ANSWER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}