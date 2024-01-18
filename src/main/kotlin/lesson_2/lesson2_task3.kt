package lesson_2

private const val UNIVERSAL_TIME_CONSTANT = 60
fun main() {
    val departureTimeInMinutes = (9 * UNIVERSAL_TIME_CONSTANT) + 39
    val travelTimeInMinutes = 457

    val totalTimeInMinutes = departureTimeInMinutes + travelTimeInMinutes
    val arrivalHours = totalTimeInMinutes / UNIVERSAL_TIME_CONSTANT
    val arrivalMinutes = totalTimeInMinutes - (arrivalHours * UNIVERSAL_TIME_CONSTANT)

    println("Arrival time - $arrivalHours:$arrivalMinutes")
}