package lesson_8

fun main() {
    val arrayOfViews = IntArray(7)

    for (i in arrayOfViews.indices) {
        arrayOfViews[i] = (0..300).random()
    }

    println("Всего просмотров за неделю: ${arrayOfViews.sum()}")
}