package Section_2.Chapter_9_varargs

import atomictest.*

fun evaluate(vararg ints: Int) =
    "Size: ${ints.size}\n" +
            "Sum: ${ints.sum()}\n" +
            "Average: ${ints.average()}"
fun main() {
    evaluate(10, -3, 8, 1, 9) eq """
Size: 5
Sum: 25
Average: 5.0
"""
}