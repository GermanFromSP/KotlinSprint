package lesson_16

fun main() {
    val order = Order(12, "В обработке")
    order.printOrderInfo()

    order.sendRequestToChangeStatus("Готовится")
    order.printOrderInfo()
}

class Order(private val number: Int, private var status: String) {

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun sendRequestToChangeStatus(newStatus: String) {
        changeStatus(newStatus)
    }

    fun printOrderInfo() {
        println("Заказ №$number. Статус: $status")
    }
}