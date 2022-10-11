package Section_2.Sets

import Packages.atomictest.eq

fun main () {
    val list = listOf(3, 3, 2, 1, 2)
    list.toSet() eq setOf(1, 2, 3)
    list.distinct() eq listOf(3,2,1)
    "abbcc".toSet() eq listOf('a','b','c')
}