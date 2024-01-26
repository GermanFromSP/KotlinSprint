package lesson_6

fun main() {
    println("Придумайте логин:")
    val newLogin = readln()
    println("Придумайте пароль:")
    val newPassword = readln()

    do {

        println("Введите ваш логин:")
        val existingLogin = readln()
        println("Введите ваш пароль:")
        val existingPassword = readln()

        val failedAuth = (newLogin != existingLogin) || (newPassword != existingPassword)

        if (failedAuth) {
            println("Неверный логин или пароль! Повторите попытку")
        }

    } while (failedAuth)

    println("Авторизация прошла успешно")
}