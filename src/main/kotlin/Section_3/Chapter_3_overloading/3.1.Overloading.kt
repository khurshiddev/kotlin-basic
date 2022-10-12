package Section_3.Chapter_3_overloading

import atomictest.eq

class Overloading{
    fun over()=0
    fun over(a:Int,)= a+2

}
fun main (){
    val o=Overloading()
    o.over() eq 0
    o.over(3) eq 5
}