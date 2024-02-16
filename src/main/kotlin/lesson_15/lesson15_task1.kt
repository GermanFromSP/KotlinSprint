package lesson_15

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.swim()

    duck.fly()
    duck.swim()

    seagull.fly()
    seagull.swim()
}

interface FloatingCreature {
    fun swim()
}

interface FlyingCreature {
    fun fly()
}

class Crucian : FloatingCreature {
    override fun swim() {
        println("Карась плывет")
    }
}

class Seagull : FlyingCreature, FloatingCreature {
    override fun fly() {
        println("Чайка летит")
    }

    override fun swim() {
        println("Чайка плывет")
    }

}

class Duck : FlyingCreature, FloatingCreature {
    override fun swim() {
        println("Утка плывет")

    }

    override fun fly() {
        println("Утка летит")
    }

}