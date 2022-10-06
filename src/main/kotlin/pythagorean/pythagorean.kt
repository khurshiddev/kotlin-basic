package pythagorean

import kotlin.math.sqrt

class RighTriangle(val a: Double,val b: Double){
    fun hypotenuse() = sqrt(a*a+b*b)
    fun area()= a * b /2
}


