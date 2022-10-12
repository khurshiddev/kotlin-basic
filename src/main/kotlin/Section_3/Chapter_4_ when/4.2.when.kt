package Section_3.`Chapter_4_ when`

fun main() {
    val age = 20
    when {
        age in 0..1 -> {
            println("Go'dak")
        }

        age in 0..12 -> {
            println("yosh bola")
        }

        age in 12..18 -> {
            println("o'smirin")
        }

        age in 19..40 -> {
            println(" navqiron")
        }

        age > 40 -> {
            println("qariya odam")
        }

    }
}