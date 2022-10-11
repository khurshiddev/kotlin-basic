import Packages.atomictest.eq

fun main () {
    calculateBMI(160,68) eq "Normalweight"
    calculateBMI(100,68) eq "Underweight"
    calculateBMI(200,68) eq "Overweight"

}
fun calculateBMI(lbs: Int, weight: Int)= " Nomal Weight"