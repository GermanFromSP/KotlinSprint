package lesson_4

private const val MIN_BOXES_OF_PROVISIONS = 50
private const val MIN_CREW_SIZE = 55
private const val MAX_CREW_SIZE = 70

fun main() {

    println("Наличие повреждений корпуса (true/false): ")
    val isDamaged = readln().toBoolean()

    println("Текущий состав экипажа: ")
    val crewSize = readln().toInt()

    println("Количество ящиков с провизией на борту: ")
    val boxesOfProvision = readln().toInt()

    println("Благоприятность метеоусловий (true/false): ")
    val isGoodWeather = readln().toBoolean()

    val isApproved = (isDamaged &&
            isGoodWeather &&
            boxesOfProvision >= MIN_BOXES_OF_PROVISIONS &&
            crewSize == MAX_CREW_SIZE)
            ||
            (!isDamaged &&
            boxesOfProvision > MIN_BOXES_OF_PROVISIONS &&
            crewSize <= MAX_CREW_SIZE &&
            crewSize >= MIN_CREW_SIZE)

    println("Разрешение на отплытие: $isApproved")

}