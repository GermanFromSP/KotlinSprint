package lesson_14

fun main() {
    val liner = Liner2(
        speedInKnots = 24,
        liftingCapacityInTons = 2_000,
        passengerCapacity = 340
    )

    val cargoShip = CargoShip2(
        speedInKnots = 10,
        liftingCapacityInTons = 80_000,
        passengerCapacity = 60
    )

    val icebreaker = Icebreaker2(
        speedInKnots = 20,
        liftingCapacityInTons = 12_000,
        passengerCapacity = 75
    )

    println(liner.getShipProperties())
    println(icebreaker.getShipProperties())
    println(cargoShip.getShipProperties())
}

open class Liner2(
    val speedInKnots: Int,
    val liftingCapacityInTons: Int,
    val passengerCapacity: Int,
) {

    open fun getStartLoading() = "Pulls out the horizontal ladder from the waist"

    open fun getShipProperties(): String {
        return """
            Speed = $speedInKnots
            Carrying capacity = $liftingCapacityInTons
            Passenger capacity = $passengerCapacity
            Loading method: ${getStartLoading()}
        """.trimIndent()
    }
}

class Icebreaker2(
    speedInKnots: Int,
    liftingCapacityInTons: Int,
    passengerCapacity: Int,
    val canCrushIce: Boolean = true
) : Liner2(speedInKnots, liftingCapacityInTons, passengerCapacity) {

    override fun getStartLoading() = "Icebreaker opens gate from stern side"

    override fun getShipProperties(): String {
       return super.getShipProperties() + "\nCan crush ice: $canCrushIce"
    }
}

class CargoShip2(
    speedInKnots: Int,
    liftingCapacityInTons: Int,
    passengerCapacity: Int,
) : Liner2(speedInKnots, liftingCapacityInTons, passengerCapacity) {

    override fun getStartLoading() = "Cargo ship activates loading crane"

    override fun getShipProperties(): String {
        return super.getShipProperties()
    }
}