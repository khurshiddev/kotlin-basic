package Section_3.Chapter_12_Extension_Properties

import atomictest.eq

val String.indices: IntRange
    get() = 0 until length
fun main() {
    "abc".indices eq 0..2
}