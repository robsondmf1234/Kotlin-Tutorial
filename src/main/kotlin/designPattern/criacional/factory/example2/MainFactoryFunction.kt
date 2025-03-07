package designPattern.criacional.factory.example2

sealed class Animal {
    data object Dog : Animal()
    data object Cat : Animal()
}

fun animalFactory(type: String): Animal {
    return when (type.lowercase()) {
        "dog" -> Animal.Dog
        "cat" -> Animal.Cat
        else -> throw IllegalArgumentException("Unknown animal type")
    }
}

fun main() {
    val dog = animalFactory("dog")
    println(dog) // Output: Dog
}