package lesson_12

fun main() {
    val weatherData = WeatherData4(
        dailyTemperatureKelvin = 300,
        nightTemperatureKelvin = 290,
        _rainfallPerDay = true
    )
}

class WeatherData4(
    dailyTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    _rainfallPerDay: Boolean
) {
    val dailyTemperatureCelsius = (dailyTemperatureKelvin - NEGATIVE_ZERO_KELVIN_IN_CELSIUS).toInt()
    val nightTemperatureCelsius = (nightTemperatureKelvin - NEGATIVE_ZERO_KELVIN_IN_CELSIUS).toInt()
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
        private const val NEGATIVE_ZERO_KELVIN_IN_CELSIUS = 273.15
        private const val CELSIUS = "\u2103"
    }
}