package org.example.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.lang.System
import java.util.logging.Level
import java.util.logging.Logger
import kotlin.system.measureTimeMillis

private val logger: Logger = Logger.getLogger("org.example.coroutines.ExampleCoroutines2").apply {
    level = Level.INFO
}

fun main() = runBlocking {
    // Inicia a execução do bloco de corrotinas
    println("Starting Two Coroutines in Series")
    val timeTaken = measureTimeMillis {
        // Inicia duas corrotinas de forma concorrente usando async
        val deferred1 = async { newFetchData() } // Inicia imediatamente
        val deferred2 = async { newFetchData2() } // Inicia imediatamente
        // Aguarda a conclusão das corrotinas e obtém os resultados
        val result1 = deferred1.await() // Espera a conclusão de newFetchData
        val result2 = deferred2.await() // Espera a conclusão de newFetchData2
        // Imprime os resultados das duas funções
        println("Result: $result1 and $result2")
    }
    // Imprime o tempo total gasto na execução das duas funções
    println("Time Taken: $timeTaken ms")
}

// Função suspensa que simula a busca de dados com um atraso de 1 segundo
suspend fun newFetchData(): String {
    delay(1000)
    return "Data 1"
}

// Função suspensa que simula a busca de dados com um atraso de 1 segundo
suspend fun newFetchData2(): String {
    delay(1000)
    return "Data 2"
}