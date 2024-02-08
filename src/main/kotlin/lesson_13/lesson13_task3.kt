package lesson_13

fun main() {
    val contactsList = listOf(
        Contact3("Gordon", 89993334445),
        Contact3("John", 86665551112),
        Contact3("Kitana", 89120057773, "null"),
        Contact3("Baraka", 89963147842, "KB"),
        Contact3("Kenshi", 89934564219, "TOKIO CITY"),
    )

    println(contactsList.mapNotNull { if (it.company == "null") null else it.company })
}

class Contact3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {

    fun printInfo() {
        println("Контакт(Имя: $name, Номер:$phoneNumber, Компания: ${company ?: "<не указано>"})")
    }
}