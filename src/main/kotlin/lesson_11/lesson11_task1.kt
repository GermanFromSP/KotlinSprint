package lesson_11

fun main() {
    val firstUser = User(
        1,
        "User1Login",
        "password1",
        "email1@gmail.com"
    )
    val secondUser = User(
        2,
        "User2Login",
        "password2",
        "email2@gmail.com"
    )

    firstUser.printUser()
    secondUser.printUser()
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {
    fun printUser() {
        println(
            """
        id - $id
        Login - $login
        Password - $password
        Email - $email
    """.trimIndent()
        )
    }
}