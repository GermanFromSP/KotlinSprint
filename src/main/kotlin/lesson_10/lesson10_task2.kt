package lesson_10

fun main() {
    println("Введите имя (не менее 4-х символов):")
    val userName = readln()

    println("Введите пароль (не менее 4-х символов):")
    val userPassword = readln()

    if (!checkDataLength(userName) || !checkDataLength(userPassword)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать!")
    }
}

fun checkDataLength(userParameter: String): Boolean {
    val minLength = 4
    return userParameter.length >= minLength
}