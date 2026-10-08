package org.example.designPattern.estrutural.decorator.example2

// Decorator que adiciona uma etapa de criptografia antes do envio.

// Decorator para criptografar a mensagem
class EncryptedMessage(message: Message) : MessageDecorator(message) {
    override fun send(content: String) {
        val encryptedContent = "**${content.reversed()}**" // Simulação de criptografia
        println("Mensagem criptografada: $encryptedContent")
        super.send(encryptedContent)
    }
}
