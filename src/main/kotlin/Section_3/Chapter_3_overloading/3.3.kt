package Section_3.Chapter_3_overloading

import atomictest.trace

fun foo(n: Int = 99) = trace("foo-1-$n")

fun main() {

    foo()
    trace eq """foo-2 foo-1-14
    """
}
