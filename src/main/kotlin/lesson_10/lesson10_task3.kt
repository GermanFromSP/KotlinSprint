package lesson_10

fun main() {
    println("Введите длину пароля:")
    val passwordLength = readln().toInt()

    println("Ваш пароль: ${generatePassword(passwordLength)}")
}

fun generatePassword(passwordLength: Int): String {
    val numbers = (0..9).toList()
    val specialSymbols = (32..47).toList()
    var password = ""

    for (i in 1..passwordLength) {
        if (i % 2 == 0) {
            password += specialSymbols[specialSymbols.indices.random()].toChar()
        } else {
            password += numbers[numbers.indices.random()]
        }
    }
    return password
}