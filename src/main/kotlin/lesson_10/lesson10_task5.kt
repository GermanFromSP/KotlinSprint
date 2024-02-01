package lesson_10

const val USER_NAME = "JessePinkman"
const val USER_PASSWORD = "C10H15N"

val shoppingBasket = mapOf(
    "Кислота фтороводородная 1000 мл. " to 5,
    "Тара пластиковая 200 л." to 3,
    "Ванна чугунная" to 1,
    "Респиратор-маска полнолицевая 3м 6800" to 2
)

fun main() {
    println("Введите имя:")
    val name = readln()
    println("Введите пароль:")
    val password = readln()

    val token = userAuthorization(name, password)
    printBasket(token)
}

fun userAuthorization(name: String, password: String): String? {
    var token: String? = null
    if (name == USER_NAME && password == USER_PASSWORD) {
        token = generateToken()
    }
    return token
}

fun printBasket(token: String?) {
    if (token.isNullOrEmpty()) {
        println("Неверный логин или пароль")
    } else {
        println("Добро пожаловать, $USER_NAME! Ваша корзина:")
        shoppingBasket.forEach { (t, u) -> println("$t - $u шт") }
    }
}

fun generateToken(): String {
    val alphabet = ('a'..'z').toList()
    val numbers = (1..9).toList()
    var token = ""

    for (i in 1..32) {
        val randomNumber = (0..99).random()
        when (randomNumber) {
            in 0..30 -> token += alphabet[alphabet.indices.random()]
            in 30..60 -> token += alphabet[alphabet.indices.random()].uppercaseChar()
            else -> token += numbers[numbers.indices.random()]
        }
    }

    return token
}