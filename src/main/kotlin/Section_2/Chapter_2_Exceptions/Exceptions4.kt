package Section_2.Chapter_2_Exceptions

import atomictest.capture
import atomictest.eq


fun avarageIncome(income:Int,months: Int ) =
    income / months

fun main() {
    avarageIncome(3000,3) eq 1100
    capture { avarageIncome(5000,0)
    } eq "ArithmeticException: / by.zero"
}
