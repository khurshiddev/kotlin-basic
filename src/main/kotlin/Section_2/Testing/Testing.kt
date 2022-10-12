import atomictest.*

fun main () {
    val v1 = 11
    val v2 = "Antology"

    v1 eq 11
    v2 eq " Antology"

    v2 neq "Epistomoly"
}