package Section_3.Chapter_10_ExtensionsForNullableTypes

import atomictest.eq

fun main () {
"".isNullOrEmpty() eq true
}

fun String?.isNullOrEmpty():Boolean =
    this == null || isEmpty()

