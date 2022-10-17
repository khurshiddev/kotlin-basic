package Section_3.Chapter_8_Safe_Calls

import atomictest.eq

fun checkLenght(s:String?, expected: Int){
    val lenght1 =
        if (s!=null) s.length else 0
    val lenght2 = s?.length ?: 0
    lenght1 eq expected
    lenght2 eq expected

}
fun main () {
    checkLenght("abc",3)
    checkLenght(null,0)
}