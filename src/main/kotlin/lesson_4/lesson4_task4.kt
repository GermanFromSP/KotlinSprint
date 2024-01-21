package lesson_4

fun main() {
    val dayCount = 5
    val isEvenDay = (dayCount % 2) == 0

    println(
        """
        Упражнения для рук:  ${!isEvenDay}       
        Упражнения для ног:  $isEvenDay      
        Упражнения для спины: $isEvenDay 
        Упражнения для пресса:${!isEvenDay}    
    """.trimIndent()
    )
}