package Section_2.Chapter_3_Lists

import atomictest.*

fun getList(): List<Int> {
    return mutableListOf(1, 2, 3)
}
fun main() {
// getList() produces a read-only List:
    val list = getList()
    //list += 3 // Error
    list eq listOf(1, 2, 3)
}