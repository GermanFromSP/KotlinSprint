package lesson_14

fun main() {
    val liner = Liner(
        speedInKnots = 24,
        liftingCapacityInTons = 2_000,
        passengerCapacity = 340
    )

    val cargoShip = CargoShip(
        speedInKnots = 10,
        liftingCapacityInTons = 80_000,
        passengerCapacity = 60
    )

    val icebreaker = Icebreaker(
        speedInKnots = 20,
        liftingCapacityInTons = 12_000,
        passengerCapacity = 75
    )
}

open class Liner(
    val speedInKnots: Int,
    val liftingCapacityInTons: Int,
    val passengerCapacity: Int,
)

class CargoShip(
    speedInKnots: Int,
    liftingCapacityInTons: Int,
    passengerCapacity: Int,
) : Liner(speedInKnots, liftingCapacityInTons, passengerCapacity)

class Icebreaker(
    speedInKnots: Int,
    liftingCapacityInTons: Int,
    passengerCapacity: Int,
    val canCrushIce: Boolean = true
) : Liner(speedInKnots, liftingCapacityInTons, passengerCapacity)