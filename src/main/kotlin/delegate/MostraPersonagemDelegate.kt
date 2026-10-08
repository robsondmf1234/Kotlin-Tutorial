package org.example.delegate

// Contrato de delegate responsavel por imprimir os dados de um personagem.

// Interface que define um contrato para mostrar os detalhes de um personagem
interface MostraPersonagemDelegate {
    // Método abstrato que deve ser implementado para imprimir os detalhes de um personagem
    fun imprimePersonagem(personagem: Personagem)
}
