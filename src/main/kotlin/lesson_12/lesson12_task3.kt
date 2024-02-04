package lesson_12

fun main() {
    val weatherData = WeatherData3(300, 290, true)

    weatherData.printWeatherData()
}

class WeatherData3(
    dailyTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    _rainfallPerDay: Boolean
) {

    private val dailyTemperatureCelsius = (dailyTemperatureKelvin - TEMPERATURE_CONST).toInt()
    private val nightTemperatureCelsius = (nightTemperatureKelvin - TEMPERATURE_CONST).toInt()
    private val rainfallPerDay = _rainfallPerDay

    fun printWeatherData() {
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