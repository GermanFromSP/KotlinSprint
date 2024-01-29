package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf(
        "Фарш", "Фасоль", "Томаты", "Перец чили", "Тортилья", "Базилик"
    )

    println("Какой ингридиент желаете найти?")
    val requiredIngredient = readln()

    for (i in arrayOfIngredients.indices) {
        if (arrayOfIngredients[i] == requiredIngredient) {
            println("Ингредиент $requiredIngredient в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}