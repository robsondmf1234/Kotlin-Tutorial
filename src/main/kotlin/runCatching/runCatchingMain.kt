package org.example.runCatching

// Demonstração do uso de runCatching em Kotlin
fun main() {

    // Chama a função que tenta dividir 10 por 0, capturando possíveis exceções
    runCatchingByZeroDivision(10, 0)

    // Chama a função que tenta ler um arquivo, capturando possíveis exceções
    runCatchingFileIo()

    // Chama a função que tenta converter uma String para Int, capturando possíveis exceções
    runCatchingConvertInt()

    // Chama a função que tenta acessar um elemento de uma lista, capturando possíveis exceções
    runCatchingListAccess()
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

fun runCatchingFileIo() {

    // Exemplo 1: Leitura de arquivo
    val fileResult = runCatching {
        java.io.File("arquivo.txt").readText()
    }
    fileResult.onSuccess { conteudo ->
        println("Conteúdo do arquivo: $conteudo")
    }.onFailure { ex ->
        println("Erro ao ler arquivo: ${ex.message}")
    }
}

fun runCatchingConvertInt() {
    // Exemplo 2: Conversão de String para Int
    val intResult = runCatching {
        "456".toInt()
    }
    intResult.onSuccess {
        println("Valor convertido: $it")
    }.onFailure { ex ->
        println("Erro na conversão: ${ex.message}")
    }
}

fun runCatchingListAccess() {
    // Exemplo 3: Acesso a elemento de lista
    val listResult = runCatching {
        val lista = listOf(1, 2, 3)
        lista[5] // IndexOutOfBoundsException
    }
    listResult.onSuccess { valor ->
        println("Elemento encontrado: $valor")
    }.onFailure { ex ->
        println("Erro ao acessar elemento: ${ex.message}")
    }
}
