class Counter1(var start: Int){
    fun increment(){
        start++
    }
    override fun toString()=start.toString()
}
class CounterHolder1(counter: Counter){
    private val ctr = counter
    override fun toString() =
        "hullash shu narsa " + ctr

}

fun main () {
    val c = Counter(11)
    val ch = CounterHolder(c)
    println(ch)
    c.increment()
    println(ch)
    val ch2 = CounterHolder(Counter(9))
    println(ch2)
}