package lesson_8

fun main() {
    println("Сколько ингридиентов вы хотите хранить?")
    val arrayOfValue = arrayOfNulls<String>(readln().toInt())

    for (i in arrayOfValue.indices) {
        println("${i + 1}-й ингридиент:")
        arrayOfValue[i] = readln()
    }

    println("Ваш список:\n${arrayOfValue.joinToString()} " )
}