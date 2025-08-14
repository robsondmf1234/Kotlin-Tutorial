package org.example.flow

import kotlinx.coroutines.delay          // Importa a função delay para simular operações assíncronas
import kotlinx.coroutines.flow.Flow      // Tipo Flow para trabalhar com fluxos reativos
import kotlinx.coroutines.flow.collect   // Função para coletar os valores emitidos por um Flow
import kotlinx.coroutines.flow.flow      // Construtor para criar Flows frios (cold flows)
import kotlinx.coroutines.runBlocking    // Cria um escopo de corrotina que bloqueia a thread principal

// Função principal do programa
fun main() = runBlocking {
    // 'runBlocking' cria uma corrotina que bloqueia a execução até seu término.
    // Usado aqui para simplificar o exemplo sem precisar de um ambiente assíncrono completo.

    println("Iniciando a coleta do Flow...")

    // Chama a função getLanguages() que retorna um Flow<String>
    // e coleta cada valor emitido, imprimindo na tela.
    getLanguages().collect { language ->
        println(language) // Para cada linguagem emitida, imprime o nome
    }

    println("Coleta do Flow finalizada.")
}

// Função que cria um Flow de strings com nomes de linguagens de programação
fun getLanguages(): Flow<String> {
    val listLanguages = returnLanguages() // Obtém a lista completa de linguagens

    // Cria um Flow que emite cada elemento da lista com atraso de 1 segundo
    return flow {
        for (language in listLanguages) {
            emit(language)      // Emite a linguagem atual para o coletor
            delay(1000L)        // Simula uma operação demorada ou assíncrona
        }
    }
}

// Retorna uma lista estática de linguagens de programação
fun returnLanguages(): List<String> {
    return listOf(
        "Python",
        "Java",
        "Kotlin",
        "JavaScript",
        "C++",
        "C#",
        "Swift",
        "Ruby",
        "PHP",
        "Go",
        "Rust",
        "TypeScript",
        "Dart",
        "R",
        "Scala",
        "Perl",
        "Haskell",
        "Lua",
        "MATLAB",
        "Shell (Bash)"
    )
}
