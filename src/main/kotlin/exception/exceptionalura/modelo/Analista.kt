package br.com.alura.bytebank.modelo

// Representa o cargo de analista no dominio Bytebank com sua regra de bonificacao.

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }

}
