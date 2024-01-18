package lesson_2

fun main() {
    val interns = 30
    val employees = 50
    val internsSalary = 20_000
    val employeesSalary = 30_000

    val employeesSalaryExpenses = employees * employeesSalary
    val generalExpenses = employeesSalaryExpenses + (interns * internsSalary)
    val averageSalary = generalExpenses / (interns + employees)

    println(
        """
        1) $employeesSalaryExpenses
        2) $generalExpenses
        3) $averageSalary
    """.trimIndent()
    )
}