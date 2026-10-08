package br.com.alura.bytebank.modelo

// Simula o sistema interno que valida credenciais de objetos autenticaveis.

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }

}
