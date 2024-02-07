package lesson_13

fun main() {
    val contact = Phonebook("Elvis", 89998887776)

}

class Phonebook(
    name: String,
    phoneNumber: Long,
    company: String? = null
)

