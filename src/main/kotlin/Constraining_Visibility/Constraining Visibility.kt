package Constraining_Visibility
class Cookie (private var isReady: Boolean){
    private fun crumble() =
        println("crumble")

    fun bite()=
        println("bite")

    fun eat (){
        isReady = true
        crumble()
        bite()
    }

}
fun main () {
    val x = Cookie(false)

    x.bite()
    x.eat()
}