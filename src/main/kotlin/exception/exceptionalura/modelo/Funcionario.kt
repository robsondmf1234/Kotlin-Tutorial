package br.com.alura.bytebank.modelo

// Classe base para funcionarios com os dados comuns e a bonificacao abstrata.

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
){
    abstract val bonificacao: Double


}
