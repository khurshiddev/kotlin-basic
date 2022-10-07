package Lists

import Packages.atomictest.eq

fun main() {
    val numbers = listOf(1, 2, 3)
    val strings = listOf("One, Two, Three")

    val numbers2 = listOf<Int>(1, 2, 3)
    val strings2 = listOf<String>("One, Two, Three")

    numbers eq numbers2
    strings eq strings2
}