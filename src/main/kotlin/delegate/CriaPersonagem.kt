package org.example.delegate

class CriaPersonagem {
    // Cria um objeto Personagem com nome "Gandalf", raça "Humano", classe "Mago" e nível 20
    val personagem = Personagem("Gandalf", "Humano", "Mago", 20)

    // Função que recebe um MostraPersonagemDelegate e chama o método imprimePersonagem passando o personagem criado
    fun mostraPersonagem(mostraPersonagemDelegate: MostraPersonagemDelegate) {
        mostraPersonagemDelegate.imprimePersonagem(personagem)
    }
}
