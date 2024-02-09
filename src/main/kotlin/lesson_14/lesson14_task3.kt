package lesson_14

import kotlin.math.pow

fun main() {
    val listOfFigure = listOf(
        Circle("black", 12),
        Rectangle("white", 9, 19),
        Circle("white", 7),
        Rectangle("black", 3, 8),
        Circle("black", 16),
        Rectangle("white", 7, 14)
    )

    println(
        String.format("Сумма периметров черных фигур: %.2f",
            listOfFigure.filter { it.color == "black" }.sumOf { it.calculatePerimeter() }
        )
    )
    println(
        String.format("Сумма площадей белых фигур: %.2f",
            listOfFigure.filter { it.color == "white" }.sumOf { it.calculateArea() }
        )
    )
}

abstract class Figure {
    abstract val color: String
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    override val color: String,
    val radius: Int,
) : Figure() {

    override fun calculatePerimeter() = 2 * (Math.PI * radius)

    override fun calculateArea() = (Math.PI * radius).pow(2)
}

class Rectangle(
    override val color: String,
    val width: Int,
    val length: Int,
) : Figure() {
    override fun calculateArea() = (width * length).toDouble()

    override fun calculatePerimeter() = 2 * (width + length).toDouble()
}


