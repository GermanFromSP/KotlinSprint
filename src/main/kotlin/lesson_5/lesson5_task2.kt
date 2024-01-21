package lesson_5

private const val AGE_OF_MAJORITY = 18
private const val THIS_YEAR = 2024

fun main() {
    val yearOfBirth = readln().toInt()

    if (AGE_OF_MAJORITY <= (THIS_YEAR - yearOfBirth)) {
        println("Показать экран со скрытым контентом")
    }
}