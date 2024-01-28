package lesson_8

fun main() {
    var arrayOfIngredients = arrayOf(
        "Лук", "Чеснок", "Картофель", "Куриные бедра", "Баклажаны", "Перец красный", "Томаты"
    )

    println(
        """
        Необходимые ингридиенты для рагу:
        ${arrayOfIngredients.joinToString()}
        Какой ингридиент желаете заменить?
    """.trimIndent()
    )

    val userIngredient = readln()

    for (i in arrayOfIngredients.indices) {
        if (arrayOfIngredients[i] == userIngredient) {
            println("На какой продукт заменить?")
            val newUserIngredient = readln()

            arrayOfIngredients[i] = newUserIngredient
            println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString()}")
            return
        }
    }

    println("Такого ингридиента нет в списке")


}