package lesson_3

fun main() {
    var surname = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 20

    println("ФИО на момент $age лет: $surname $name $patronymic")

    surname = "Cидорова"
    age = 22

    println("ФИО на момент $age лет: $surname $name $patronymic")
}