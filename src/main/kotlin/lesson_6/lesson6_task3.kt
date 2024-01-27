package lesson_6

fun main() {
    println("На сколько секунд завести таймер?")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}