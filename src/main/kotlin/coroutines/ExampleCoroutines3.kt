package org.example.coroutines

import kotlinx.coroutines.*

fun main() {
    // Inicia uma corrotina em segundo plano
    //Sempre que uma corrotina é iniciada, ela é executada em um contexto específico.
    // O GlobalScope é um escopo global que não tem um ciclo de vida associado a ele.
    GlobalScope.launch {
        task2()
    }
    task1()
    Thread.sleep(2000L) // Aguarda a conclusão da tarefa em segundo plano
}

fun task1() {
    print("Hello ")
    print("(thread -"+Thread.currentThread().name + ") ")
}

// Função suspensa que simula uma tarefa longa
suspend fun task2() {
    //Especificando o contexto de execução da corrotina
    withContext(Dispatchers.IO) {
        print("World! ")
        // Simula uma tarefa longa
        delay(1000L)
        print("(thread -"+Thread.currentThread().name + ") ")    }
}
