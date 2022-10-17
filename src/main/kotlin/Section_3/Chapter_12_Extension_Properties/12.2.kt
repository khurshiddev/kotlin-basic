package Section_3.Chapter_12_Extension_Properties

import atomictest.eq

val <T> List<T>.firstOrNull: T?
    get() = if (isEmpty()) null else this[0]
fun main() {
    listOf(1, 2, 3).firstOrNull eq 1
    listOf<String>().firstOrNull eq null
}