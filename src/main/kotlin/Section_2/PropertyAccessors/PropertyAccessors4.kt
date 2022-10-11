package Section_2.PropertyAccessors

class Cage2(private val maxCapacity: Int) {
    private val hamsters =
        mutableListOf<Hamster>()

    fun capacity(): Int =
        maxCapacity - hamsters.size

    fun isFull(): Boolean =
        hamsters.size == maxCapacity


}

class Hammer {
    fun speak() = "speak! "
    fun exercise() =
        this.speak() +
                speak() +
                "Ha bu sthis ishladi"
}

fun main() {
    val ham = Hammer()
    println(ham.exercise())

    val q1 = Coop()
    q1.percentFull = 80
    val q2 = Coop()
    q2.percentFull = 150
    println(q1.percentFull)
    println(q2.percentFull)

    val g = Coop2()
    g.add(80)
    println(g.percentFull1)
    val g1 = Coop2()
    g1.add(180)
    println(g1.percentFull1)


    val sof = Hourse()
    sof.sofa = "sofa sleeper simple 89.00"
    println(sof.sofa)
    sof.sofa = "koja divan 30.000"
    println(sof.sofa)
}

class Coop2 {
    var percentFull1 = 0
    var max = 100
    fun add(inc: Int): Int {
        percentFull1 += inc
        if (percentFull1 > max)
            percentFull1 = max
        return percentFull1

    }


}
class Coop {
    var percentFull = 0
}

class Hourse{
    var sofa: String = ""
}
