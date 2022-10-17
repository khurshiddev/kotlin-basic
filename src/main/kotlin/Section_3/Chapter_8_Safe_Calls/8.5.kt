package Section_3.Chapter_8_Safe_Calls

import atomictest.eq

class Person(
    val name:String,
    var friend: Person? =null
)
fun main () {
    val alice =Person( "Alice")
    alice.friend?.friend?.name eq null

   val bob = Person("Bob")
   val charlie =Person("Charlie", bob)
   bob.friend =charlie
   bob.friend?.friend?.name eq "Bob"

    (alice.friend?.friend?.name
        ?: "Unknown") eq "Unknown"
}