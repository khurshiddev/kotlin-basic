package Section_2.Lists

import atomictest.*

fun inferred(p:Char, q:Char)=
    listOf(p,q)
fun expelist(p:Char, q:Char): List<Char> =
    listOf(p,q)

fun main () {
    inferred('A', 'Z') eq "[A, Z]"
    expelist('D', 'Y') eq "[D, Y]"
}