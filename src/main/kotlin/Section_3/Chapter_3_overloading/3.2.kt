package Section_3.Chapter_3_overloading

import atomictest.eq

class My {
    fun foo() = 0
}

fun My.foo() = 1
fun My.foo(i: Int) = i + 2

fun f(n: Int) = n + 373
fun f() = f(0)

fun g(r: Int = 0) = r + 373

fun main() {
    My().foo() eq 0
    My().foo(1) eq 3
    f() eq 373
    g() eq 373
}