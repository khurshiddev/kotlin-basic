package Section_3.Chapter_8_Safe_Calls

import atomictest.trace

fun String.echo() {
    trace(toUpperCase())
    trace(this)
    trace(toLowerCase())

}

fun main() {
    val s1: String? = "Howdy!"
    s1?.echo()
    val s2: String? = null
    s2?.echo()
    trace eq """
        Howdy!
        Howdy!
        howdy!
        """
}