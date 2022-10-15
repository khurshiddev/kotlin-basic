package Section_3.Chapter_5_enum

import Section_3.Chapter_3_overloading.addDouble
import atomictest.eq

enum class Level{
    Overflow, High, Medium, Low, Empty
}
fun main() {
    Level.High eq "High"
}