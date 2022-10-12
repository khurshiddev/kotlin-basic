package Section_3.Chapter_2_named

import atomictest.eq

class Color(
    val red: Int = 0,
    val blue: Int = 0,
    val green: Int = 0,
)
{
    override fun toString()=
       "($red,$blue,$green)"
}
fun main () {
    Color(red =77).toString() eq ("77, 0,0")
}