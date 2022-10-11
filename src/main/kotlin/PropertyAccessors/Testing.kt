package PropertyAccessors

class MutableAlien(var name: String)
class FixedName(val name: String)

fun main() {


    val an =Animals2("Zirafe ", 2,2,2)
    val an2 =Animals2("Begimot", 2,2, 2)
    println(an2.describe())
    println(an.describe())

}

class Animals2(
    val name: String,
    val eyes: Int,
    val legs: Int,
    val hands: Int
) {
    fun describe() =
        "$name and $eyes with " +
                "$legs and $hands "

}
