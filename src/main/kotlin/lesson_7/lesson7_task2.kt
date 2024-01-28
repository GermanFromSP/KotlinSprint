package lesson_7

fun main() {

    while (true) {
        val randomNumber = (1000..9999).random()

        println("Ваш код авторизации: $randomNumber \nВведите код ниже:")
        val userNumber = readln().toInt()

        if (userNumber == randomNumber) break else continue
    }

    println("Добрый день!")
}