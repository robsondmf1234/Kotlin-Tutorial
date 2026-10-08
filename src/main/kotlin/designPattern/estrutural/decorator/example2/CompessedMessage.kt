package org.example.designPattern.estrutural.decorator.example2

// Decorator que simula a compressao da mensagem antes do envio.

// Decorator para comprimir a mensagem
class CompressedMessage(message: Message) : MessageDecorator(message) {
    override fun send(content: String) {
        val compressedContent = content.replace(" ", "") // Simulação de compressão removendo espaços
        println("Mensagem comprimida: $compressedContent")
        super.send(compressedContent)
    }
}
