package October_11

import atomictest.*

fun String.stringQuote()=
    this.singleQuote().singleQuote()

fun String.toManyQuotes()=
    this.doubleQuote().doubleQuote()

fun main() {
    "Hi".stringQuote() eq "'Hi'"
    "Hi".toManyQuotes() eq "\"Hi"
}