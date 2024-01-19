package lesson_2

import kotlin.math.pow

private const val ANNUAL_INTEREST_RATE = 16.7
private const val FULL_PERCENT = 100
private const val INVESTMENT_PERIOD_IN_YEARS = 20

fun main() {
    val initialAmount = 70_000

    println(
        String.format(
            "%.3f",
            initialAmount * (1 + (ANNUAL_INTEREST_RATE / FULL_PERCENT)).pow(INVESTMENT_PERIOD_IN_YEARS)
        )
    )
}