package lesson_12

fun main() {
    val yesterday = WeatherData()
    val today = WeatherData()

    yesterday.changeWeatherReadings(
        12.7,
        9.2,
        false
        )

    today.changeWeatherReadings(
        17.8,
        10.3,
        true
    )
}

class WeatherData() {

    private var dailyTemperature = 24.7
    private var nightTemperature = 15.5
    private var rainfallPerDay = false

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