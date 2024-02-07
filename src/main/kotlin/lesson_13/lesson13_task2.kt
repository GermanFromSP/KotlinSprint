package lesson_13

fun main() {
    val contact = Contact2("Alex", 88005553535)
    contact.printInfo()
}

class Contact2(
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