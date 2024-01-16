package lesson_1

fun main() {
    var numberOfEmployees: Int
    var numberOfOrders: Int?
    val thanksForPurchase = "Thank you for your purchase, we look forward to seeing you again!"

    numberOfOrders = 12
    println("Number of orders: $numberOfOrders \n$thanksForPurchase")

    numberOfEmployees = 2000
//    println("Number of employees: $numberOfEmployees")
    numberOfEmployees -= 1
    println("Number of employees: $numberOfEmployees")
}