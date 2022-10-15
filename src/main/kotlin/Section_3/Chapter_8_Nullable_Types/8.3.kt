package Section_3.Chapter_8_Nullable_Types

class Amphibian
enum class Species{
    Frog, Toad, Salamander, Caecilian
}
fun main () {
    val a1: Amphibian = Amphibian()
    val a2: Amphibian? = null
    val t1: Species = Species.Toad
    val t2: Species? =null
}