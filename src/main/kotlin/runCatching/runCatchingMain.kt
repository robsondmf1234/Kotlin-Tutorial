package org.example.runCatching

// Demonstração do uso de runCatching em Kotlin
fun main() {

    // Chama a função que tenta dividir 10 por 0, capturando possíveis exceções
    runCatchingByZeroDivision(10, 0)

    // Utiliza runCatching para capturar exceção de divisão por zero
    val result2 = runCatching {
        // Simulando uma operação que pode falhar
        10 / 0 // Isso vai lançar uma ArithmeticException
    }
    // Se a operação for bem-sucedida, imprime o resultado
    result2.onSuccess {
        println("Operação bem-sucedida: $it")
        // Se ocorrer erro, imprime a mensagem da exceção
    }.onFailure { exception ->
        println("Ocorreu um erro: ${exception.message}")
    }

    // Utiliza runCatching para capturar exceção ao tentar converter uma string inválida para inteiro
    val result = runCatching {
        // Simulando uma operação que pode falhar
        val number = "123a".toInt()  // Isso vai lançar uma NumberFormatException
        number * 2
    }

    // Verifica se a operação foi bem-sucedida ou falhou
    result.onSuccess { value ->
        println("Operação bem-sucedida: $value")
    }.onFailure { exception ->
        println("Ocorreu um erro: ${exception.message}")
    }

}

// Função que tenta dividir dois números usando runCatching para capturar exceções
fun runCatchingByZeroDivision(number: Int, divisor: Int) {
    runCatching {
        // Simulando uma operação que pode falhar
        number / divisor // Isso vai lançar uma ArithmeticException se divisor for 0
        // Se a operação for bem-sucedida, imprime o resultado
    }.onSuccess { value ->
        println("Operação bem-sucedida: $value")
        // Se ocorrer erro, imprime a mensagem da exceção
    }.onFailure { exception ->
        println("Ocorreu um erro: ${exception.message}")
    }
}