package Section_2.Chapter_7_Sets

import atomictest.*

fun main() {
    val mutset = mutableSetOf<Int>()
    mutset += 42
    mutset += 42
    mutset eq setOf(42)
    mutset -= 42
    mutset eq setOf<Int>()
}