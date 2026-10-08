package org.example.map

fun main() {
    println("Exemplo de Map em Kotlin")
    println("1 Exemplo")
    val idadePorNome = mapOf(
        "Ana" to 25,
        "Bruno" to 30,
        "Carla" to 22
    )
    println(idadePorNome)
    println("")

    println("2 Exemplo")
    val notas = mutableMapOf(
        "João" to 8.5,
        "Maria" to 9.0
    )
    println(notas)
    println("")

    println("3 Exemplo")
    val nomes = listOf("ana", "bruno", "carla")
    val nomesMaiusculos = nomes.map { it.uppercase() }
    println(nomesMaiusculos) // [ANA, BRUNO, CARLA]
    println("")

    println("4 Exemplo")
    val persons = listOf(
        Person(name = "Robson", age = 35),
        Person(name = "Douglas", age = 40)
    )

    val adults = persons.map {
        PersonAdult(
            name = it.name,
            age = it.age,
            job = "Developer",
            hasDriverLicense = true
        )
    }
    println(adults)
    println("")

    println(idadePorNome["Ana"]) // 25
}

data class Person(
    val name: String,
    val age: Int
)

data class PersonAdult(
    val name: String,
    val age: Int,
    val job: String,
    val hasDriverLicense: Boolean
)