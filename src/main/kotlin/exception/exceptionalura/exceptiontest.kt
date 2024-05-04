import exception.exceptionalura.teste.testaComportamentosConta
import exception.exceptionalura.exceptionmodels.exception.SaldoInsuficienteException

fun main() {
    println("Inicio main")
    testaComportamentosConta()
}

fun funcao1() {
    println("Inicio funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
        println("SaldoInsuficienteException foi pega")
    }
    println("Fim funcao 1")
}

fun funcao2() {
    println("Inicio funcao2")

    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("Fim funcao 2")
}

