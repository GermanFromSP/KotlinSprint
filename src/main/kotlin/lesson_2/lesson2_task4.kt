package lesson_2

private const val BUFF_PERCENT = 0.2
fun main() {
    val crystalOre = 7
    val ironOre = 11

    println(
        "Crystal ore buff: +${(crystalOre * BUFF_PERCENT).toInt()}" +
                "\nIron ore buff: +${(ironOre * BUFF_PERCENT).toInt()}"
    )
}