package Section_3.Chapter_1_extension

fun main() {
    var car = Car("Genesis")
    car.start()
    car.stop()
    car.park()


}

fun Car.park(){
    println("the car is parking")
}
class  Car( var name: String){
    fun start(){
        println("the car is starting")
    }
    fun stop(){
        println("the car is stoping")
    }
}