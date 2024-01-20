package lesson_4

private const val TOTAL_TABLES = 13

fun main() {
    val reservationForToday = 13
    val reservationForTomorrow = 9

    println("Доступность столиков на сегодня: ${reservationForToday < TOTAL_TABLES}")

    println("Доступность столиков на завтра: ${reservationForTomorrow < TOTAL_TABLES}")
}