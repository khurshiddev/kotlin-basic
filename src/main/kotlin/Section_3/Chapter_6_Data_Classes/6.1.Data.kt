package Section_3.Chapter_6_Data_Classes

import atomictest.eq

data class Simple(
    var arg1: String,
    val arg2: Int
) {

}

fun main() {
    val s1 = Simple("Hi", 29)
    val s2 = Simple("Hi", 29)
    s1 eq "Simple (arg1=Hi, arg2=29)"
    s1 eq s2
}