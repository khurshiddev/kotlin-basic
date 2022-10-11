package Lists

import Packages.atomictest.eq


fun main() {
    val set = setOf(1, 5, 2, 4, 1, 5, 2)
    set eq setOf(1,5,2,4)

}

