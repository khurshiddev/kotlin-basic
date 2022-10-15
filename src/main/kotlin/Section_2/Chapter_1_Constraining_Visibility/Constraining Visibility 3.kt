package Section_2.Chapter_1_Constraining_Visibility

private var index = 0

private class Animals(var name: String)
private fun recordAnimal(animals: Animals){
    println("Animal #$index:  ${animals.name}")
    index++
}

fun recorAnimals(){
    recordAnimal(Animals("Tiger"))
    recordAnimal(Animals("Antelope"))
}

fun recordAnimalsCount(){
    println("$index animals are here !")
}

fun main () {
    recorAnimals()
    recordAnimalsCount()
}

