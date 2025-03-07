package org.example.designPattern.criacional.factory.example5

// Interface comum para todos os tipos de veículos
interface Vehicle {
    fun drive()
}

// Implementação da interface Vehicle - Carro
class Car : Vehicle {
    override fun drive() {
        println("Driving a car")
    }
}

// Implementação da interface Vehicle - Moto
class Motorcycle : Vehicle {
    override fun drive() {
        println("Riding a motorcycle")
    }
}

// Sealed class para os tipos de veículos
sealed class VehicleType {
    object Car : VehicleType()
    object Motorcycle : VehicleType()
}

// Fábrica para criar objetos Vehicle
class VehicleFactory {
    fun createVehicle(type: VehicleType): Vehicle {
        return when (type) {
            VehicleType.Car -> Car()
            VehicleType.Motorcycle -> Motorcycle()
        }
    }
}

// Uso da fábrica
fun main() {
    val factory = VehicleFactory()

    val car: Vehicle = factory.createVehicle(VehicleType.Car)
    car.drive()  // Saída: Driving a car

    val motorcycle: Vehicle = factory.createVehicle(VehicleType.Motorcycle)
    motorcycle.drive()  // Saída: Riding a motorcycle
}