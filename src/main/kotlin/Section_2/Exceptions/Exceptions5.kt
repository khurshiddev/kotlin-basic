package Section_2.Exceptions

import atomictest.*

fun averageIncome1(income: Int, months: Int) =
    if (months == 0)
        null
    else
        income / months

fun main () {
    averageIncome1(3300,3) eq 1100
    averageIncome1(5000,0) eq null
}

