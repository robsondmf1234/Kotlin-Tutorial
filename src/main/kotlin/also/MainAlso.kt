package org.example.also

fun main() {
    val nomes = mutableListOf("Ana", "Bruno")
        .also {
            // Executa esta ação usando a lista recém-criada.
            // O also devolve a própria lista, sem alterá-la.
            println("Lista criada: $it")
        }
        .apply {
            // O apply também devolve a própria lista.
            // Aqui, adicionamos mais um nome a ela.
            add("Carla")
        }

// Exibe a lista final: [Ana, Bruno, Carla]
    println(nomes)
}