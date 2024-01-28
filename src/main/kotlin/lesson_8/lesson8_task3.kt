package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf(
        "Фарш", "Фасоль", "Томаты", "Перец чили", "Тортилья", "Базилик"
    )

    println("Какой ингридиент желаете найти?")
    val requiredIngredient = readln()

    if (arrayOfIngredients.contains(requiredIngredient)) {
        println("Ингредиент $requiredIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}