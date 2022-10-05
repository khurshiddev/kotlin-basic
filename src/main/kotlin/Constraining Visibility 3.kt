private var index = 0

private class Animal(val name: String)
    private fun recordAnimal(animal: Animal) {

        println("Anilmal #$index: ${animal.name}")
        index++
    }
    fun recordAnimals() {
        recordAnimal(Animal("Tiger"))
        recordAnimal(Animal("Antelope"))
    }
    fun recorAnimalsCount() {
        println("$index Animals are here !")
    }

fun main (){
    recordAnimals()
    recorAnimalsCount()
}


