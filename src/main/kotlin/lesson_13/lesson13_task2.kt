package lesson_13

fun main() {
    val contact = Contact2("Alex", 88005553535)
    contact.printInfo()
}

class Contact2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {

    fun printInfo() {
        println("Контакт(Имя: $name, Номер:$phoneNumber, Компания: ${company ?: "<не указано>"})")
    }
}