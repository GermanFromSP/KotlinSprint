package lesson_9

fun main() {
    println("Введите 5 ингридиентов через \", \"")
    val stringOfIngredients = readln()
        .split(", ")
        .sorted()
        .forEach {
            println(it)
        }
}