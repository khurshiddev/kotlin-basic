package Section_2.Lists

import atomictest.*

fun main () {
    val ints = listOf(1, 2, 3)
    capture {
        ints[3]
    }contains
            listOf("ArrayIndexOutOfBoundsException")
}