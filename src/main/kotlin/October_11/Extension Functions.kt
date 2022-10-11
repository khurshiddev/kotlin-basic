package October_11

import Packages.atomictest.eq

fun String.singleQuote() = "$this"
fun String.doubleQuote() = "\"$this\""

fun main () {
    "Hi".singleQuote() eq "'Hi'"
    "Hi".doubleQuote() eq "\"Hi"
}