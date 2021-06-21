package Inheritance

class CarDriver : Driver()

class TruckDriver : Driver(){
    override fun drive(){
        println("I am a Truck Driver")
    }
}

class AutoRickshawDriver : Driver(){
    override fun drive() {
        super.drive()
        println("I drive AutoRickshaw")
    }
}

fun main(){
    val carDriver = CarDriver()
    carDriver.drive()
    println()
    val truckDriver = TruckDriver()
    truckDriver.drive()
    println()
    val autoRickshawDriver = AutoRickshawDriver()
    autoRickshawDriver.drive()
}