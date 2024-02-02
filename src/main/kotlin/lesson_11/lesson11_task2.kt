package lesson_11

fun main() {

    val user = User2(
        3,
        "John",
        "123",
        "email3@gmail.com"
    )

    user.updateBio()
    user.changePassword()
    user.printUserData()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = ""
) {
    fun printUserData() {
        println(
            """
                id - $id
                Login - $login
                Password - $password
                Email - $email
                Biography - $bio
            """.trimIndent()
        )
    }

    fun updateBio() {
        println("Расскажите о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Ваш текущий пароль: ")

        if (password == readln()) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль успешно изменен!")
        } else {
            println("Неправильный пароль!")
        }
    }
}