package org.example.designPattern.factory.example3

interface Car {
    fun drive()
}

class Sedan : Car {
    override fun drive() = println("Driving a Sedan")
}

class SUV : Car {
    override fun drive() = println("Driving an SUV")
}

object CarFactory {
    fun createCar(type: String): Car {
        return when (type.lowercase()) {
            "sedan" -> Sedan()
            "suv" -> SUV()
            else -> throw IllegalArgumentException("Unknown car type")
        }
    }
}

fun main() {
    val car1 = CarFactory.createCar("sedan")
    car1.drive() // Output: Driving a Sedan

    val car2 = CarFactory.createCar("suv")
    car2.drive() // Output: Driving an SUV
}
