package Section_3.Chapter_8_Nullable_Types

import atomictest.eq

fun main () {
    val map = mapOf(0 to "yes",1 to "no")
    val first:String? = map[0]
    val second: String? =map[2] // bu yerda 2 indexda hech narsa yo'q

    first eq "yes"
    second eq null

    val s: String? = "abc"
    if (s != null)
        s.length eq 3

}