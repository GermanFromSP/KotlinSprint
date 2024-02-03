package lesson_11

fun main() {

}

class Ingredient(val title: String)

class Category(
    val image: String,
    val title: String,
    val description: String,
)

class Recipe(
    val image: String,
    val title: String,
    var isFavourite: Boolean = false
    ) {

    private val recipeMap = mutableMapOf<Ingredient, Int>()

    fun addNewIngredient(ingredient: Ingredient, quantity: Int) {
        recipeMap[ingredient] = quantity
    }

    fun removeIngredient(ingredient: Ingredient) {
        recipeMap.remove(ingredient)
    }

    fun getAllIngredient() = recipeMap
}

