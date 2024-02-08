package lesson_13

import java.lang.Exception

fun main() {
    var retry = true

    println("Имя:")
    val name = readln()

    println("Компания")
    val company = readln().ifEmpty { null }

    println("Номер:")
    var number = readln()

    while (retry) {
        retry = false
        try {
            number.toLong()
        } catch (e: Exception) {
            println(
                "Ошибка \"${e.javaClass.simpleName}\" " +
                        "\nНомер должен состоять только из цифр. Попробуйте снова."
            )

            println("Номер:")
            number = readln()
            retry = true
        }
    }

    println("Контакт успешно создан!")
    val contact = Contact5(name, number.toLong(), company)
    contact.printInfo()
}

class Contact5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {

    fun printInfo() {
        println("Контакт(Имя: $name, Номер:$phoneNumber, Компания: ${company ?: "<не указано>"})")
    }
}