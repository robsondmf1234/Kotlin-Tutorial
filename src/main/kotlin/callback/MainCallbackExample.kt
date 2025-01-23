package org.example.callback

import kotlin.random.Random

fun main() {

    for (i in 1..100) {
        callBackString { newString ->
            println(newString)
        }
    }

    for (i in 1..10) {
        callBackInt { number ->
            println(number)
        }
    }

    for (i in 1..10) {
        callBackPerson { person ->
            println(person)
        }
    }
}

fun callBackString(valueChanged: (String) -> Unit) {
    val randomInt = Random.nextInt(0, 10)
    val result = if (randomInt % 2 == 0) {
        "Robson"
    } else {
        "Douglas"
    }
    valueChanged(result)
}

fun callBackInt(valuewChanged: (Int) -> Unit) {
    val randomInt = Random.nextInt(0, 10)
    valuewChanged(randomInt)
}

fun callBackPerson(valueChanged: (Person) -> Unit) {
    val randomInt = Random.nextInt(0, 10)
    val result = if (randomInt % 2 == 0) {
        Person(name = "Robson", age = 35)
    } else {
        Person(name = "Douglas", age = 35)
    }
    valueChanged(result)
}

data class Person(
    val name: String,
    val age: Int
)