package lesson_9

private const val POSITIVE_RESPONSE = "Да"

fun main() {
    val listOfIngredients = mutableListOf("Баранина", "Зира", "Рис")

    println("В рецепте есть базовые ингредиенты: ${listOfIngredients.joinToString()}")
    println("Желаете добавить еще?")
    val userDecision = readln().replaceFirstChar(Char::titlecase)

    if (userDecision == POSITIVE_RESPONSE) {
        println("Какой ингредиент вы хотите добавить?")
        listOfIngredients.add( readln().replaceFirstChar(Char::titlecase) )
        println("Теперь в рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString()}")
    } else {
        return
    }
}