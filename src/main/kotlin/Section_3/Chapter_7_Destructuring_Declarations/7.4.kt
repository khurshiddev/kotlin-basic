package Section_3.Chapter_7_Destructuring_Declarations

import atomictest.eq

data class Tuple(
    val i:Int,
    val d: Double,
    val g: String,
    val r: Boolean,
    val e: List<Int>
)
fun main (){
    val tuple = Tuple(
        1,3.14, "Mouse", false, listOf())
    val (i,d,g,r,e) = tuple
    i eq 1
    d eq 3.14
    g eq "Mouse"
    r eq false
    e eq listOf()

    val (_,_,animal) = tuple
    animal eq "Mouse"
}