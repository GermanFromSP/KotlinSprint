package lesson_15

fun main() {
    val weatherServer = WeatherServer()
    val temperature = Temperature(27)
    val precipitation = PrecipitationAmount(12)

    weatherServer.printWeatherData(temperature)
    weatherServer.printWeatherData(precipitation)
}

abstract class WeatherStationStats {
    abstract fun getWeatherData()
}

class Temperature(val temperature: Int) : WeatherStationStats() {

    override fun getWeatherData() {
        println("Температура: $temperature $CELSIUS")
    }

    companion object {
        private const val CELSIUS = "\u2103"
    }
}

class PrecipitationAmount(val millimeters: Int) : WeatherStationStats() {

    override fun getWeatherData() {
       println("Осадки на сегодня: $millimeters мм.")
    }
}

class WeatherServer() {

    fun printWeatherData(weatherStationStats: WeatherStationStats) {
        when (weatherStationStats) {
            is Temperature -> weatherStationStats.getWeatherData()
            is PrecipitationAmount -> weatherStationStats.getWeatherData()
            else -> println("Ошибка запроса")
        }
    }
}

