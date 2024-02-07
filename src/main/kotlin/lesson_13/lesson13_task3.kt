package lesson_13

fun main() {
    val contactsList = listOf<Contact3>(
        Contact3("Gordon", 89993334445, null),
        Contact3("John", 86665551112, null),
        Contact3("Kitana", 89120057773, "null"),
        Contact3("Baraka", 89963147842, "KB"),
        Contact3("Kenshi", 89934564219, "TOKIO CITY"),
    )

    contactsList
        .filter { it.company != "<не указано>" && it.company != "null" }
        .forEach { println(it.company) }
}

class Contact3(
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