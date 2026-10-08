package org.example.designPattern.criacional.singleton

// Executa o exemplo de singleton reutilizando a mesma instancia global.

fun main() {
    // Chama o método conectar do DatabaseManager e armazena o resultado em conexao1
    val conexao1 = DatabaseManager.conectar()
    // Chama o método conectar do DatabaseManager novamente e armazena o resultado em conexao2
    val conexao2 = DatabaseManager.conectar()

    // Imprime o resultado da primeira conexão
    println(conexao1)
    // Imprime o resultado da segunda conexão
    println(conexao2)
}
