package org.example.functionTypes

//Código que demonstra uso de tipos funções
fun main() {

    //Exemplo de variavel do tipo função
    //Declaramos uma variavel que recebe uma função que recebe dois inteiros e retorna um double,igual a função safeDivide
    // o :: é um operador que permite referenciar uma função: no caso safeDivide, estamos passando a referência da função para a variável f
    val f: (Int, Int) -> Double = ::safeDivide
    println(f(10, 2))

    recebeFuncao(f)

    //exemplosDeTiposFuncoes()
}

//Exemplo de função que recebe uma função como parametro
//Recebe uma função que recebe dois inteiros e retorna um double igual a função safeDivide
private fun recebeFuncao(f: (Int, Int) -> Double) {
    println(f(10, 2))
}

//Exemplo de variavel do tipo função
//Recebe dois inteiros e retorna um double
private fun safeDivide(number1: Int, denominador: Int) = if (denominador == 0) 0.0 else number1.toDouble() / denominador

private fun exemplosDeTiposFuncoes() {
    //Declaração de uma função que recebe um inteiro e retorna um inteiro
    val minhaFuncao2: (Int) -> Int = { a: Int -> a * 2 }

    //Chamada da função
    println(minhaFuncao2(10))

    //Declaração de uma função que recebe um inteiro e retorna um inteiro
    val minhaFuncao3 = { a: Int -> a * 2 }

    //Chamada da função
    println(minhaFuncao3(10))

    //Declaração de uma função que recebe um inteiro e retorna um inteiro
    val minhaFuncao4 = { a: Int -> a * 2 }

    //Chamada da função
    println(minhaFuncao4(10))

    //Declaração de uma função que recebe um inteiro e retorna um inteiro
    val minhaFuncao5 = { a: Int, b: Int -> a * b }

    //Chamada da função
    println(minhaFuncao5(10, 20))

    //Declaração de uma função que recebe um inteiro e retorna um inteiro
    val minhaFuncao6 = { a: Int, b: Int -> a * b }

    //Chamada da função
    println(minhaFuncao6(10, 20))

    //Declaração de uma função que recebe um inteiro e retorna um inteiro
    val minhaFuncao7 = { a: Int, b: Int -> a * b }

    //Chamada da função
    println(minhaFuncao7(10, 20))

    //Declaração de uma função que recebe um inteiro e retorna um inteiro
    val minhaFuncao8 = { a: Int, b: Int -> a * b }

    //Chamada da função
    println(minhaFuncao8(10, 20))

    //Declaração de uma função que recebe um inteiro e retorna um inteiro
    val minhaFuncao9 = { a: Int, b: Int -> a * b }
}