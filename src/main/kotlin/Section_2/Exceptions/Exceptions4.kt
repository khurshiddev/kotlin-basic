package Section_2.Exceptions

import Packages.atomictest.*

fun avarageIncome(income:Int,months: Int ) =
    income / months

fun main() {
    avarageIncome(3000,3) eq 1100
    capture { avarageIncome(5000,0)
    } eq "ArithmeticException: / by.zero"
}
