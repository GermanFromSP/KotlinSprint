package lesson_4

private const val REQUIRED_HUMIDITY_IN_PERCENT = 20
private const val BAD_SEASON = "Зима"

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val airHumidityInPercent = 20
    val currentSeason = "Зима"

    val isGoodConditions = (isSunny && isAwningOpen) and
            ((airHumidityInPercent == REQUIRED_HUMIDITY_IN_PERCENT) && (currentSeason != BAD_SEASON))

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodConditions")
}