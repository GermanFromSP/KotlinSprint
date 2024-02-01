package lesson_9

fun main() {
    val oneServing = listOf(2, 50, 15)

    println("Какое количество порций?")
    val numberOfServing = readln().toInt()
    val severalServing = oneServing.map { it * numberOfServing }

    println(
        "На $numberOfServing порций вам понадобится:" +
                " Яиц – ${severalServing[0]} шт.," +
                " молока – ${severalServing[1]} мл. ," +
                " сливочного масла – ${severalServing[2]} гр."
    )
}