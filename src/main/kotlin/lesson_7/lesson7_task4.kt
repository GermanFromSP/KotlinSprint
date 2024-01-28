package lesson_7

fun main() {
    println("На сколько секунд засечь таймер?")
    val timer = readln().toInt()

    for (i in timer downTo 1) {
        println(i)
        Thread.sleep(1000)
    }

    println("Время вышло")
}