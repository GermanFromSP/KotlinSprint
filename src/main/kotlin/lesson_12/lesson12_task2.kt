package lesson_12

fun main() {
    val yesterday = WeatherData2(13.8, 10.1, true)
    val today = WeatherData2(15.9, 8.7, true)

    yesterday.changeWeatherReadings(12.7, 9.2, false)
    today.changeWeatherReadings(17.8, 10.3, true)
}

class WeatherData2(
    var dailyTemperature: Double,
    var nightTemperature: Double,
    var rainfallPerDay: Boolean
) {

    fun changeWeatherReadings(
        dailyTemperature: Double,
        nightTemperature: Double,
        rainfallPerDay: Boolean
    ) {
        this.dailyTemperature = dailyTemperature
        this.nightTemperature = nightTemperature
        this.rainfallPerDay = rainfallPerDay

        println(
            """
            Температура днем: $dailyTemperature
            Температура ночью: $nightTemperature
            Наличие осадков: $rainfallPerDay
        """.trimIndent()
        )
    }
}