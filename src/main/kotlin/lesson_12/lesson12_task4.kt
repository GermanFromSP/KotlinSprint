package lesson_12

fun main() {
    val weatherData = WeatherData4(300, 290, true)


}

class WeatherData4(
    dailyTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    _rainfallPerDay: Boolean
) {
    val dailyTemperatureCelsius = (dailyTemperatureKelvin - TEMPERATURE_CONST).toInt()
    val nightTemperatureCelsius = (nightTemperatureKelvin - TEMPERATURE_CONST).toInt()
    val rainfallPerDay = _rainfallPerDay
    init {
        println(
            """
            Температура днем: $dailyTemperatureCelsius $CELSIUS
            Температура ночью: $nightTemperatureCelsius $CELSIUS
            Наличие осадков: $rainfallPerDay
        """.trimIndent()
        )
    }

    companion object {
        private const val TEMPERATURE_CONST = 273.15
        private const val CELSIUS = "\u2103"
    }
}