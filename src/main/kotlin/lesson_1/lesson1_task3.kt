package lesson_1

import java.time.Year

fun main() {
    val year = 1961
    var hour = "09"
    var minute = "07"

    println(
        """
        Year of flight - $year
        Start - $hour:$minute
    """.trimIndent()
    )

    hour = "10"
    minute = "55"

    println("Finish - $hour:$minute")
}
