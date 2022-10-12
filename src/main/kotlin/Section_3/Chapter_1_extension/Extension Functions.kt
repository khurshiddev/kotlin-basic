package October_11

import atomictest.*

fun String.singleQuote() = "$this"
fun String.doubleQuote() = "\"$this\""

fun main () {
    "Hi".singleQuote() eq "'Hi'"
    "Hi".doubleQuote() eq "\"Hi"
}