package lesson_9

fun main() {
    val listOfIngredients = listOf(
        "Морковь",
        "Лук",
        "Чеснок",
        "Перец",
        "Цукини",
    )

    println("В рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach { println(it) }
}