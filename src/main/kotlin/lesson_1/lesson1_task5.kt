package lesson_1

private const val SECONDS_IN_HOUR = 3600
private const val SECONDS_IN_MINUTE = 60
fun main() {
    val commonTimeInSeconds = 6480
    with(commonTimeInSeconds) {
        val seconds = this - (this / SECONDS_IN_MINUTE) * SECONDS_IN_MINUTE
        val minutes = this / SECONDS_IN_MINUTE - (this / SECONDS_IN_HOUR) * SECONDS_IN_MINUTE
        println("0${this / SECONDS_IN_HOUR}:$minutes:0$seconds")
    }
}