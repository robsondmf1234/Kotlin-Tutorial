package org.example.callback.example2

data class User(val name: String, val age: Int)

// Define uma interface com um método de callback
interface Callback {
    fun onSuccess(user: User)
    fun onFailure(error: String)
}

// Classe que executa uma operação assíncrona e chama o callback
class AsyncOperation {
    fun execute(callback: Callback) {
        // Simula uma operação assíncrona
        val success = true

        // Chama o callback com base no resultado da operação
        if (success) {
            callback.onSuccess(User(name = "Robson", age = 37))
        } else {
            callback.onFailure("Falha na operação.")
        }
    }
}

// Função principal para executar o exemplo
fun main() {
    val operation = AsyncOperation()

    // Usa um object como callback
    operation.execute(object : Callback {
        override fun onSuccess(user: User) {
            println("Sucesso: $user")
        }

        override fun onFailure(error: String) {
            println("Erro: $error")
        }
    })
}