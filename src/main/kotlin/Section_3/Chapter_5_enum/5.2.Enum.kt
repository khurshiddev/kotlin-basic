package Section_3.Chapter_5_enum
import atomictest.eq

enum class Size{
    Tiny, Small, Medium, Large, Huge, Ginastic
}
fun main () {
   Size.Ginastic eq "Ginastic"
    Size.values().toList() eq
            listOf(Size.Tiny)

}