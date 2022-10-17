package Section_3.Chapter_9_Non_Null_Assertions

import atomictest.eq

fun main() {
    val s: String? = "ard"
    s!!.length eq 3
}