package Section_3.Chapter_11_Generic

import atomictest.eq

fun main () {
    val holder = RigidHolder(Automobile("BMW"))
    holder.getValue() eq
            "Automobile(brand=BMW)"
}
data class Automobile(val brand: String)

class RigidHolder(private  val a: Automobile){
    fun getValue() = a
}
