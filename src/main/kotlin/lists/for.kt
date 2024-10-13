package org.example.lists

// Cria uma lista imutável de frutas
val listFruits = listOf("Apple", "Banana", "Orange", "Strawberry")

fun main() {
    println("\nFor loop")
    // Itera sobre a lista de frutas usando um loop for com um range de 0 até o tamanho da lista menos 1
    for (index in 0..listFruits.size - 1) {
        println("Fruit at $index is ${listFruits[index]}")
    }

    println("\nRefactoring for loop")
    // Refatora o loop for para usar um range de 0 até o tamanho da lista (exclusivo)
    for (index in 0 until listFruits.size) {
        println("Fruit at $index is ${listFruits[index]}")
    }

    println("\nFor loop with step")
    // Itera sobre a lista de frutas usando um loop for com um range de 0 até o último índice da lista
    for (index in 0..listFruits.lastIndex) {
        println("Fruit at $index is ${listFruits[index]}")
    }

    println("\nFor with indices")
    // Itera sobre a lista de frutas usando o range de índices da lista
    for (index in listFruits.indices) {
        val fruit = listFruits[index]
        println("Fruit at $index is $fruit")
    }

    println("\nFor with withIndex")
    // Itera sobre a lista de frutas usando a função withIndex, que retorna pares de índice e valor
    for ((index, fruit) in listFruits.withIndex()) {
        println("Fruit at $index is $fruit")
    }

    println("\nFor with forEachIndexed")
    // Itera sobre a lista de frutas usando a função forEachIndexed, que fornece o índice e o valor
    listFruits.forEachIndexed { index, fruit ->
        println("Fruit at $index is $fruit")
    }
    println("\nFor with forEach")
    // Itera sobre a lista de frutas usando a função forEach, que fornece apenas o valor
    listFruits.forEach {
        println("Fruit is $it")
    }
}