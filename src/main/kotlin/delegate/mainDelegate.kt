package org.example.delegate


fun main() {
    // Cria uma instância de CriaPersonagem
    val criaPersonagem = CriaPersonagem()

    // Chama o método mostraPersonagem com uma implementação anônima de MostraPersonagemDelegate
    criaPersonagem.mostraPersonagem(object : MostraPersonagemDelegate {
        // Sobrescreve o método imprimePersonagem para imprimir os detalhes do personagem
        override fun imprimePersonagem(personagem: Personagem) {
            println(
                "Personagem Criado: \n" +
                        "Nome: ${personagem.nome}\n" +
                        "Raça: ${personagem.raca}\n" +
                        "Classe: ${personagem.classe}\n" +
                        "Nível: ${personagem.nivel}"
            )
        }
    })
}