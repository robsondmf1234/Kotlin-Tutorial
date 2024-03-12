package sealedclass

fun main() {
    val bicycle = Bicycle(manufacturer = "Caloi")
    val car = Car(manufacturer = "Tesla", model = "model 3")
    println(getVehicle(bicycle))
    println(getVehicle(car))
}

//Realizado a criação da maneira mais usual
/*
open class Vehicle()

data class Car(
    val manufacturer: String,
    val model: String
) : Vehicle()

data class Bicycle(
    val manufacturer: String
) : Vehicle()

//Ao realizarmos alguma consulta atraves do when o kotlin , será obrigado a realizar um when exaustive,
//contemplando as possiveis alternativas ,alem disso será obrigatorio a inclusão de uma clausula else,
//para valores fora do esperado
fun getVehicle(vehicle: Vehicle) =
    when (vehicle) {
        is Car -> println("${vehicle.manufacturer} - ${vehicle.model}")
        is Bicycle -> println(vehicle.manufacturer)
        else -> println("Unknown Vehicle!")
    }
*/

sealed class Vehicle()

data class Car(
    val manufacturer: String,
    val model: String
) : Vehicle()

data class Bicycle(
    val manufacturer: String
) : Vehicle()

data class Atv(
    val manufacturer: String
) : Vehicle()

//Ao utlizarmos classes com sealed class , o proprio when saberá quais os tipos de classes que podem
//conter nas clausulas, sem nos obrigar a passar uma clausula else
fun getVehicle(vehicle: Vehicle) =
    when (vehicle) {
        is Bicycle -> "${vehicle.manufacturer}"
        is Car -> "${vehicle.manufacturer} - ${vehicle.model}"
        is Atv -> "${vehicle.manufacturer} "
    }
