package Section_2.Chapter_3_Lists

import atomictest.*

fun main () {
    val ints = listOf(1, 2, 3)
    capture {
        ints[3]
    }contains
            listOf("ArrayIndexOutOfBoundsException")
}