package Section_2.Exceptions

import atomictest.*

fun averageIncome2(income: Int, months: Int) =
    if (months == 0)
        throw IllegalArgumentException(
            "Month can't be zero"
        )
    else
        income / months

fun main() {
    averageIncome2(3300, 3) eq 1100
    capture {
        averageIncome2(5000, 0)
    } eq "IllegalArgumentException" +
            "Month can't be zero"
}