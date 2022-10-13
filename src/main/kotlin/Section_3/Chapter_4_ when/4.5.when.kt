package Section_3.`Chapter_4_ when`

import atomictest.trace

fun main() {
    val yes = "A"
    val no = "B"
    for (choice in listOf(yes, no, yes)) {
        when (choice) {
            yes -> trace("Hooray! ")
            no -> trace("To bad! ")
        }
        if (choice == yes) trace("Hooray! ")
        else if (choice == no) trace("To bad! ")
    }
    trace eq """
        Hooray! 
        Hooray! 
        To bad! 
        To bad! 
        Hooray! 
        Hooray! """
}