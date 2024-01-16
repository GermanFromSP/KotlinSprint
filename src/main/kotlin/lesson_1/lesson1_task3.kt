package lesson_1

fun main() {
    val year = 1961
    var hour = "09"
    var minute = "07"

    println(
        """
        Year of flight - $year
        Hour - $hour
        Minute - $minute
    """.trimIndent()
    )

    hour = "10"
    minute = "55"

    println("Landing - $hour:$minute")
}
