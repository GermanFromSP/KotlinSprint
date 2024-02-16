package lesson_16

fun main() {
    val user = User("dog97", "1234")

    println("Введите пароль:")
    val password = readln()

    if (user.checkUserPassword(password)) {
        println("Пароль подтвержден")
    } else {
        println("Неверный пароль")
    }
}

class User(login: String, password: String) {

    private val userLogin = login
    private val userPassword = password

    fun checkUserPassword(password: String): Boolean {
        return password == userPassword
    }
}