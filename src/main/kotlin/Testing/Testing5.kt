package Testing

import Packages.atomictest.eq


fun main() {
    calculateBMI3(160.0, 68.0) eq "Normal weight"
    calculateBMI3(100.0, 68.0) eq "Underweight"
    calculateBMI3(200.0, 68.0) eq "Overweight"
}

fun calculateBMI3(lbs: Double, height: Double): String {
    val bmi = lbs / (height * height) * 703.07
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"

}