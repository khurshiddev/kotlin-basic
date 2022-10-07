package Sets

import Packages.atomictest.eq

fun main() {
    val mutset = mutableSetOf<Int>()
    mutset += 42
    mutset += 42
    mutset eq setOf(42)
    mutset -= 42
    mutset eq setOf<Int>()
}