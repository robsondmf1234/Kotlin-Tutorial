package br.com.alura.bytebank.modelo

// Contrato para objetos que participam do processo de autenticacao.

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}
