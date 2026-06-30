package org.example.callback

fun main() {

    val text = "Hello World!"
    val number = 10

    // Chama a função de extensão isText no número, que verificará se é uma String e executará o callback
    // e lancara a exceção caso não seja uma String
//    number.isText {
//        println(it)
//    }

    // Função que recebe um texto e uma função de callback
    text.imprimeTexto(texto = text) { texto ->
        println(texto)
    }

}

// Função de extensão para a classe String que recebe um texto e uma função de callback
fun String.imprimeTexto(texto: String, callback: (String) -> Unit) {
    // Chama o callback passando o texto
    if (true) callback(texto) else throw IllegalArgumentException("O texto não é uma String")
}

// Função de extensão genérica que verifica se o valor é uma String e executa o bloco de código
// passando o valor como argumento
// Se o valor não for uma String, uma exceção é lançada
// O bloco de código é uma função de callback que recebe uma String
internal fun <T> T.isText(callback: (String) -> Unit) {
    if (this is String) callback(this)
    else throw IllegalArgumentException("O texto não é uma String")
}