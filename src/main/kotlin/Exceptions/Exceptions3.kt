package Exceptions

import Packages.atomictest.eq

fun main () {
    "1$".toIntOrNull() eq null
}