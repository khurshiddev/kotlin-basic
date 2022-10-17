package Section_3.Chapter_9_Non_Null_Assertions

import atomictest.capture
import atomictest.eq

fun main() {
    var x: String? = "abc"
    x!! eq "abc"
    x = null
    capture {
        val s: String = x!!
    } eq "NullPointerException"
}