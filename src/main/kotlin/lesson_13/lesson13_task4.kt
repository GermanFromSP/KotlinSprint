package lesson_13

private const val POSITIVE_RESPONSE = "Да"

fun main() {
    val contactsList = mutableListOf<Contact4>()
    var userDecision = POSITIVE_RESPONSE

    while (userDecision == POSITIVE_RESPONSE) {
        println("Имя:")
        val name = readln()

        println("Номер:")
        var number = readln().toLongOrNull()

        println("Компания")
        val company = readln().ifEmpty { null }

        if (number == null) {
            while (number == null) {
                println("Заполните поле \"Номер\"!")
                number = readln().toLongOrNull()
            }
        }

        contactsList.add(Contact4(name, number, company))

        println("Контакт успешно добавлен. Добавить еще? (Да/Нет)")
        userDecision = readln()
    }

    contactsList.forEach { it.printInfo() }
}

class Contact4(
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