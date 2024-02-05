package lesson_12

import java.util.Random

fun main() {
    val listOfWeatherData = mutableListOf<WeatherData5>()

    for (day in 1..30) {
        listOfWeatherData.add(
            WeatherData5(
                (270..310).random(),
                (270..310).random(),
                Random().nextBoolean(),
            )
        )
    }

    val listOfDayTemperature = listOfWeatherData.map { it.dailyTemperatureCelsius }
    val listOfNightTemperature = listOfWeatherData.map { it.nightTemperatureCelsius }
    val listOfRainfall = listOfWeatherData.map { it.rainfallPerDay }.filter { it }

    println(
        """
           Средняя температура днем: ${listOfDayTemperature.average().toInt()}${WeatherData5.CELSIUS}
           Средняя температура ночью: ${listOfNightTemperature.average().toInt()}${WeatherData5.CELSIUS}
           Дней с осадками: ${listOfRainfall.size}
        """.trimIndent()
    )
}

class WeatherData5(
    dailyTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    _rainfallPerDay: Boolean
) {
    val dailyTemperatureCelsius = (dailyTemperatureKelvin - TEMPERATURE_CONST).toInt()
    val nightTemperatureCelsius = (nightTemperatureKelvin - TEMPERATURE_CONST).toInt()
    val rainfallPerDay = _rainfallPerDay

    companion object {
        private const val TEMPERATURE_CONST = 273.15
        const val CELSIUS = "\u2103"
    }
}