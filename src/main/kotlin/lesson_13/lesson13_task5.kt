package lesson_13

import java.lang.Exception

fun main() {
    var retry = true

    println("Имя:")
    val name = readln()


    println("Номер:")
    var number = readln()

    println("Компания")
    val company = readln().ifEmpty { null }

    while (retry) {
        retry = false
        try {
            number.toLong()
        } catch (e: Exception) {
            println(
                "Ошибка \"${e.javaClass}\" " +
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
    _name: String,
    _phoneNumber: Long,
    _company: String? = null
) {

    val name = _name
    val phoneNumber = _phoneNumber
    val company = _company ?: "<не указано>"

    fun printInfo() {
        println("Контакт(Имя: $name, Номер:$phoneNumber, Компания: $company)")
    }
}