package lesson_4

private const val MIN_WEIGHT = 35
private const val MAX_WEIGHT = 100
private const val MAX_VOLUME = 100

fun main() {
    val firstWeight = 20
    val firstVolume = 80
    val secondWeight = 50
    val secondVolume = 100

    cargoAssessment(firstWeight, firstVolume)

    cargoAssessment(secondWeight, secondVolume)
}

private fun cargoAssessment(weight: Int, volume: Int) {
    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average':" +
                "${((weight >= MIN_WEIGHT) && (weight <= MAX_WEIGHT)) and (volume < MAX_VOLUME)} "
    )
}