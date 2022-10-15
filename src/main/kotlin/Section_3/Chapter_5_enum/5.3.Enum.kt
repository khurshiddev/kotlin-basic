package Section_3.Chapter_5_enum
import Section_3.Chapter_5_enum.Level
import Section_3.Chapter_5_enum.Level.*
import atomictest.trace

fun checkLevel(level: Level){
    when(level) {
        Overflow -> trace (">>> Overflow!")
        Empty -> trace ("Alert: Empty")
        else -> trace("Level $level OK")
    }
}

fun main () {
    checkLevel(Overflow)
    checkLevel(Low)
    checkLevel(Overflow)
    trace eq """Alert: Empty
        Level Low Ok
        >>>Overflow!
    """
}
