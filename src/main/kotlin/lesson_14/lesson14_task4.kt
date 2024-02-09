package lesson_14

fun main() {
    val planet = Planet(
        name = "Jupiter",
        atmosphere = true,
        possibilityForLanding = true,
        listOfSatellite = listOf(
            Satellite(name = "Io", atmosphere = false, possibilityForLanding = false),
            Satellite(name = "Europa", atmosphere = false, possibilityForLanding = true),
        )
    )

    println(
        "Planet: ${planet.name}\nSatellites: ${
            planet.listOfSatellite.joinToString(", ", "") { it.name }
        }"
    )
}

open class CelestialFigure(
    val name: String,
    val atmosphere: Boolean,
    val possibilityForLanding: Boolean,
)

class Planet(
    name: String,
    atmosphere: Boolean,
    possibilityForLanding: Boolean,
    val listOfSatellite: List<Satellite>
) : CelestialFigure(name, atmosphere, possibilityForLanding)

class Satellite(
    name: String,
    atmosphere: Boolean,
    possibilityForLanding: Boolean,
) : CelestialFigure(name, atmosphere, possibilityForLanding)
