package lesson_2

fun main() {
    val departureTimeInMinutes = (9 * 60) + 39
    val travelTimeInMinutes = 457

    val totalTimeInMinutes = departureTimeInMinutes + travelTimeInMinutes
    val arrivalHours = totalTimeInMinutes / 60
    val arrivalMinutes = totalTimeInMinutes - (arrivalHours*60)

    println("Arrival time - $arrivalHours:$arrivalMinutes")
}