package Section_3.Chapter_10_ExtensionsForNullableTypes

import atomictest.eq

fun isNullOrEmpty(s: String?): Boolean =
    s == null || s.isEmpty()

fun main () {
    isNullOrEmpty(null) eq true
    isNullOrEmpty("") eq true
}