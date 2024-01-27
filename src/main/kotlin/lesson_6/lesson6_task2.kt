package lesson_6


fun main() {
    println("На сколько секунд завести таймер?")
    val seconds = readln().toLong()

    Thread.sleep(seconds * 1000)
    println("Прошло $seconds секунд")
}