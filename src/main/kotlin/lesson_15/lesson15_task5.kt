package lesson_15

fun main() {
    val truck = Truck(500, 1)
    val passengerCar = PassengerCar(1)

    var allWeight = 2000
    var allPassengers = 6
    var remainWeight = allWeight
    var remainPassenger = allPassengers

    while (allWeight > 0 || allPassengers > 0) {
        truck.apply {
            remainWeight = this.startLoadingCargo(allWeight)
            println("Грузовик взял ${allWeight - remainWeight} кг. Осталось: $remainWeight кг")
            remainPassenger = this.seatPassengers(allPassengers)
            println("Грузовик взял ${allPassengers - remainPassenger} человек(а). Осталось: $remainPassenger")

            startTransportation()
            startUnloadingCargo()
            disembarkPassengers()
        }
        passengerCar.apply {
            allPassengers = remainPassenger
            remainPassenger = this.seatPassengers(allPassengers)
            println("Легковой автомобиль взял ${allPassengers - remainPassenger} человека. Осталось: $remainPassenger")
            startTransportation()
            disembarkPassengers()
        }

        allWeight = remainWeight
        allPassengers = remainPassenger

        if (allWeight != 0 && allPassengers != 0) {
            truck.startTransportation()
            passengerCar.startTransportation()
        }
    }

    println("Весь груз и пассажиры доставлены!")
}

class Truck(weightOfCargo: Int, passengers: Int) : Rideable, CargoCarrier, PassengerCarrier {

    var totalWeight = weightOfCargo
    var totalPassengers = passengers

    override fun startLoadingCargo(loadingWeightInKg: Int): Int {
        totalWeight += loadingWeightInKg
        var cargoRemains = 0

        return if (totalWeight > MAX_WEIGHT) {
            cargoRemains = totalWeight - MAX_WEIGHT
            cargoRemains
        } else {
            cargoRemains
        }
    }

    override fun startUnloadingCargo() {
        println("Грузовой автомобиль разгружен")
        totalWeight = 0
    }

    override fun seatPassengers(countOfPassengers: Int): Int {
        totalPassengers += countOfPassengers
        var passengersRemains = 0

        return if (totalPassengers > MAX_AMOUNT_OF_PASSENGERS) {
            passengersRemains = totalPassengers - MAX_AMOUNT_OF_PASSENGERS
            passengersRemains
        } else {
            passengersRemains
        }
    }

    override fun disembarkPassengers() {
        println("Грузовой автомобиль высадил пассажиров")
        totalPassengers = 0
    }

    override fun startTransportation() {
        println("Грузовой автомобиль выехал и приехал к пункту назначения")
    }

    companion object {
        private const val MAX_WEIGHT = 2000
        private const val MAX_AMOUNT_OF_PASSENGERS = 1
    }
}

class PassengerCar(passengers: Int) : Rideable, PassengerCarrier {

    var totalPassengers = passengers
    override fun seatPassengers(countOfPassengers: Int): Int {
        totalPassengers += countOfPassengers
        var passengersRemains = 0

        return if (totalPassengers > MAX_AMOUNT_OF_PASSENGERS) {
            passengersRemains = totalPassengers - MAX_AMOUNT_OF_PASSENGERS
            passengersRemains
        } else {
            passengersRemains
        }
    }

    override fun disembarkPassengers() {
        println("Легковой автомобиль доставил пассажиров")
        totalPassengers = 0
    }

    override fun startTransportation() {
        println("Легковой автомобиль выехал и приехал к пункту назначения")

    }

    companion object {
        private const val MAX_AMOUNT_OF_PASSENGERS = 3
    }
}

interface Rideable {
    fun startTransportation()
}

interface CargoCarrier {
    fun startLoadingCargo(loadingWeightInKg: Int): Int
    fun startUnloadingCargo()
}

interface PassengerCarrier {
    fun seatPassengers(countOfPassengers: Int): Int
    fun disembarkPassengers()
}