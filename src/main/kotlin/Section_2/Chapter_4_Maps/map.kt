package Section_2.Chapter_4_Maps
import atomictest.*
fun main() {
    val m =
        mutableMapOf(5 to "five", 6 to "six")
    m[5] eq "five"
    m[5] = "5ive"
    m[5] eq "5ive"
    m += 4 to "four"
    m eq mapOf(5 to "5ive",
        4 to "four", 6 to "six")
}