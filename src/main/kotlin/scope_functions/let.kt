package org.example.scope_functions

// Mostra o uso de let para trabalhar com valores nao nulos em um escopo curto.

fun processNonNullString(str: String) {}

fun main() {

    val str: String? = "Hello"
    //processNonNullString(str)       // compilation error: str can be null
    val length = str?.let {
        println("let() called on $it")
        processNonNullString(it)      // OK: 'it' is not null inside '?.let { }'
        it.length
    }
    println("Tamanho: $length")
}
