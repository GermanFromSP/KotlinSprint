package lesson_7

fun main(args: Array<String>) {
    val alphabet = ('a'..'z').toList()
    val numbers = (1..9).toList()
    var password = ""

    for (i in 1..6) {
        if (i % 2 != 0) {
            password += alphabet[alphabet.indices.random()]
        } else {
            password += numbers[numbers.indices.random()]
        }
    }

    println(password)
}