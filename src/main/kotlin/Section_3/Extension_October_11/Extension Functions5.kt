package Section_3.Extension_October_11

fun main () {
    val car = Car("Genesis")
    car.start()
    car.stop()
    car.park()
}
fun Car.park(){
    println("the car is parking")
}

class Car(val name: String){
    fun start(){
        println("the car is starting")
    }
    fun stop(){
        println("the car is stoping")
    }
}