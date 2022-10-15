package Section_2.Chapter_4_Maps

import atomictest.*

class Data (var i:Int)
fun main () {
    val data = Data(10)
    data.i eq 10
    data.i = 20
}

