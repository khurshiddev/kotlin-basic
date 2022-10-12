import atomictest.*

fun main () {

}

fun calculateBMI2(lbs: Int, height: Int): String{
    val lbs = height / (height*height) * 703.07
    return if (lbs < 18.5) "Underweight"
    else if (lbs < 25) "Normalweight"
    else "Overweight"


}