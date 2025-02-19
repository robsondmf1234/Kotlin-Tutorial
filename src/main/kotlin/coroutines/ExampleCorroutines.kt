package org.example.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    // Inicia a execução do bloco de corrotinas
    println("Starting Two Coroutines in Series")
    val timeTaken = measureTimeMillis {
        // Executa fetchData1 e fetchData2 de forma sequencial
        val result1 = fetchData1()
        val result2 = fetchData2()
        // Imprime os resultados das duas funções
        println("Result: $result1 and $result2")
    }
    // Imprime o tempo total gasto na execução das duas funções
    println("Time Taken: $timeTaken ms")
}

// Função suspensa que simula a busca de dados com um atraso de 1 segundo
suspend fun fetchData1(): String {
    delay(1000)
    return "Data 1"
}

// Função suspensa que simula a busca de dados com um atraso de 1 segundo
suspend fun fetchData2(): String {
    delay(1000)
    return "Data 2"
}