package lesson_7

fun main() {
    println("Введите x, где: x > 0")
    val userNumber = readln().toInt()

    for (i in 0..userNumber step 2) {
        println(i)
    }
}