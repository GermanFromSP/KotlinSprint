package lesson_11

fun main() {

}

class Category(
    val image: String,
    val title: String,
    val description: String,
) {

    private val listOfRecipes = mutableListOf<Recipe>()

    fun addNewRecipe(recipe: Recipe) {
        listOfRecipes.add(recipe)
    }

    fun removeRecipe(recipeId: Int) {
        listOfRecipes.removeAt(recipeId)
    }

    fun getAllRecipes() = listOfRecipes
}

class Recipe(
    val id: Int,
    val image: String,
    val title: String,
    var isFavourite: Boolean = false,
) {

    private val listOfIngredients = mutableListOf<Ingredient>()

    fun addNewIngredient(ingredient: Ingredient) {
        listOfIngredients.add(ingredient)
    }

    fun removeIngredient(ingredientId: Int) {
        listOfIngredients.removeAt(ingredientId)
    }

    fun getAllIngredient() = listOfIngredients
}

class Ingredient(
    val id: Int,
    val title: String,
    val count: Int,
)