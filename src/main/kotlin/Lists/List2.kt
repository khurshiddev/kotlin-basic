package Lists

import Packages.atomictest.*

fun main () {
    val ints = listOf(1, 2, 3)
    capture {
        ints[3]
    }contains
            listOf("ArrayIndexOutOfBoundsException")
}