package org.example.scope_functions

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