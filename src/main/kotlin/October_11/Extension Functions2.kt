package October_11

import Packages.atomictest.eq
import October_11.singleQuote
import October_11.doubleQuote

fun main() {
    "Single".singleQuote() eq "'Single'"
    "Double".doubleQuote() eq "\"Double"
}