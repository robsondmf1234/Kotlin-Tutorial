package org.example.callback

import kotlin.random.Random

fun main() {
    // Executa 100 vezes a função callBackString, imprimindo "Robson" ou "Douglas" conforme o valor aleatório
    for (i in 1..100) {
        callBackString { newString ->
            println(newString)
        }
    }

    // Executa 10 vezes a função callBackInt, imprimindo um número aleatório de 0 a 9
    for (i in 1..10) {
        callBackInt { number ->
            println(number)
        }
    }

    // Executa 10 vezes a função callBackPerson, imprimindo um objeto Person (Robson ou Douglas)
    for (i in 1..10) {
        callBackPerson { person ->
            println(person)
        }
    }
}

// Função que gera um número aleatório e chama o callback com "Robson" se for par, "Douglas" se for ímpar
fun callBackString(valueChanged: (String) -> Unit) {
    val randomInt = Random.nextInt(0, 10)
    val result = if (randomInt % 2 == 0) {
        "Robson"
    } else {
        "Douglas"
    }
    valueChanged(result)
}

// Função que gera um número aleatório de 0 a 9 e chama o callback com esse valor
fun callBackInt(valuewChanged: (Int) -> Unit) {
    val randomInt = Random.nextInt(0, 10)
    valuewChanged(randomInt)
}

// Função que gera um número aleatório e chama o callback com um objeto Person (Robson ou Douglas)
fun callBackPerson(valueChanged: (Person) -> Unit) {
    val randomInt = Random.nextInt(0, 10)
    val result = if (randomInt % 2 == 0) {
        Person(name = "Robson", age = 35)
    } else {
        Person(name = "Douglas", age = 35)
    }
    valueChanged(result)
}

// Classe de dados representando uma pessoa com nome e idade
data class Person(
    val name: String,
    val age: Int
)