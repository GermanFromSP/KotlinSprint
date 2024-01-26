package lesson_6

fun main() {
    println("На сколько секунд завести таймер?")
    val seconds = readln().toInt()
    var timer = seconds

    while (timer > 0) {
        timer--
        Thread.sleep(1000)
    }
    println("Прошло $seconds секунд")
}