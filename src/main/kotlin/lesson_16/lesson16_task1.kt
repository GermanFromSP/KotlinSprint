package lesson_16

fun main() {
    val dice = Dice()

    dice.getValue()
}

class Dice() {

    private val value = (1..6).random()

    fun getValue() {
        println("Выпало: $value")
    }
}