package lesson_1

fun main() {
    val commonTimeInSeconds = 6480
    with(commonTimeInSeconds) {
        val seconds = this - (this / 60) * 60
        val minutes = this / 60 - (this / 3600) * 60
        println("0${this / 3600}:$minutes:0$seconds")
    }
}