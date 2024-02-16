package lesson_16

import kotlin.math.pow

fun main() {
    val circle = Circle(2)

    println("Длина окружности: %.2f".format(circle.calculateCircumference()))
    println("Площадь круга: %.2f".format(circle.calculateArea()))
}

class Circle(private val radius: Int) {

    fun calculateCircumference() = 2 * PI * radius

    fun calculateArea() = (PI * radius).pow(2)

    companion object {
        private const val PI = 3.14
    }
}