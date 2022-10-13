package Section_3.`Chapter_4_ when`

import atomictest.trace

class Cordinates {
    var x: Int = 0
        set(value) {
            trace("x gets $value")
            field = value
        }
    var y: Int = 0
        set(value) {
            trace("y gets $value")
            field = value
        }

    override fun toString() = "($x,$y)"
}

fun proccesInputing(inputs: List<String>) {
    val cordinates = Cordinates()
    for (input in inputs) {
        when (input) {
            "up", "u" -> cordinates.y--
            "down", "d" -> cordinates.y++
            "left", "l" -> cordinates.x--
            "right", "r" -> {

                trace("moving right")
                cordinates.x++
            }

            "nowhere" -> {}
            "exit" -> return
            else -> trace("bad input $input")
        }
    }
}

fun main() {
    proccesInputing(
        listOf(
            "up", "d", "nowhere",
            "left", "right", "exit", "r"
        )
    )
    trace eq """
        y gets -1
y gets 0
x gets -1
Moving right
x gets 0"""

}