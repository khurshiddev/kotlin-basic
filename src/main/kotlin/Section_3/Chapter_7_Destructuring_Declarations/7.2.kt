package Section_3.Chapter_7_Destructuring_Declarations

import atomictest.eq

fun main (){
    val (value , destriction) = compute(7)
    value eq 14
    destriction eq "High"
}