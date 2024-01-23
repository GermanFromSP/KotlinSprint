package lesson_5

fun main() {
    val userName = "Zaphod"
    val password = "PanGalactic"

    println("Введите имя пользователя:")
    val inputName = readln()

    if (inputName == userName) {
        println("Найдено одно совпадение.\nВведите пароль:")
        val inputPassword = readln()

        if (inputPassword == password) {
            println("Добро пожаловать!")
        } else {
            println("Неверный пароль! В доступе отказано.")
        }

    } else {
        println("Пользователь не найден. Желаете зарегестрироваться?")
    }
}