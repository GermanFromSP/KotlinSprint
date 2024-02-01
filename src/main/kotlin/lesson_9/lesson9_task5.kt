package lesson_9

fun main() {
    val listOfIngredients = mutableListOf<String>()

    println("Введите по очереди 5 разных ингридиентов:")
    for (i in 1..5) {
        listOfIngredients.add(readln())
    }

    println(
        listOfIngredients
            .sorted()
            .distinct()
            .joinToString(", ")
            .replaceFirstChar(Char::titlecase)
    )
}