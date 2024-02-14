package lesson_15

fun main() {
    val instrument = MusicalInstrument("Скрипка", 1)

    instrument.findComponents()
}

class MusicalInstrument(
    override val name: String,
    override val count: Int
) : Product(), Searchable

class MusicalComponent(
    override val name: String,
    override val count: Int
) : Product()

abstract class Product {

    abstract val name: String
    abstract val count: Int
}

interface Searchable {
    fun findComponents() {
        println("Выполняется поиск...")
    }
}


