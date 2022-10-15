package Section_3.Chapter_7_Destructuring_Declarations

import atomictest.eq

data class Computation2(
    val data: Int,
    val info: String
)
fun evaluate(input: Int) =
    if (input > 5)
        Computation2(input * 2, "High")
    else
        Computation2(input * 2, "Low")

fun main () {
    val (value, description) = evaluate (7)
    value eq 14
    description eq "High"

}
