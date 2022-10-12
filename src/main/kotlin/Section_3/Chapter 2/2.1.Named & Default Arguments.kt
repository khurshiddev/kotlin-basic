package Section_3.`Chapter 2`


import atomictest.eq

fun colors(red: Int, green: Int, blue: Int) =
    ("$red , $green, $blue")

fun main() {
    colors(1,2, 3) eq ("1,2,3")
    colors(red = 76, green = 35, blue = 0) eq
            ("76,  35,  0")
    colors(30, 54, blue = 0) eq
            ("30,54, 0")

}