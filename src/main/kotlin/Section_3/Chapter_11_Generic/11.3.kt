package Section_3.Chapter_11_Generic

import atomictest.eq

fun main () {
    val holder = AnyHolder(Dog())
    val any =holder.getValue()

    val genericHolder = GenericHolder(Dog())
    val dog = genericHolder.getValue()
    dog.bark() eq "Ruff!"
}

class AnyHolder(private val value: Any) {
    fun getValue(): Any = value
}

class Dog {
    fun bark() = "Ruff!"
}
