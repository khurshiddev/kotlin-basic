package Section_3.Chapter_8_Nullable_Types

import atomictest.eq

fun main() {
    val s1 = "abc"
    //Compile-time error:
    //val s2: String = null

    val s3: String? = null
    val s4: String? = s1
    val s6 =s4

    s1 eq "abc"
    s3 eq null
    s4 eq "abc"
    s6 eq "abc"
}