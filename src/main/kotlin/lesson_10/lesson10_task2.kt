package lesson_10

fun main() {
    println("Введите имя (не менее 4-х символов):")
    val userName = readln()

    println("Введите пароль (не менее 4-х символов):")
    val userPassword = readln()

    validateUserData(userName, userPassword)
}

fun validateUserData(name: String, password: String) {
    if (name.length < 4 || password.length < 4) {
        println("Логин или пароль недостаточно длинные")
    } else
        println("Добро пожаловать!")
}