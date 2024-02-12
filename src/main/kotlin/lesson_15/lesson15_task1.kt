package lesson_15

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.printMovementInfo()
    seagull.printMovementInfo()
    duck.printMovementInfo()
}

interface FloatingCreature {
    fun getSwim(): String
}

interface FlyingCreature {
    fun getFly(): String
}

class Crucian : FloatingCreature {
    override fun getSwim() = "Плавать"
    fun printMovementInfo() {
        println("Карась умеет: ${getSwim()}")
    }
}

class Seagull : FlyingCreature, FloatingCreature {
    override fun getFly() = "Летать"
    override fun getSwim() = "Плавать"

    fun printMovementInfo() {
        println("Чайка умеет: ${getFly()}, ${getSwim()}")
    }
}

class Duck : FlyingCreature, FloatingCreature {
    override fun getSwim()= "Летать"
    override fun getFly() = "Плавать"

    fun printMovementInfo() {
        println("Утка умеет: ${getFly()}, ${getSwim()}")
    }
}