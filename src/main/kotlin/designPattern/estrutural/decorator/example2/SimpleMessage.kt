package org.example.designPattern.estrutural.decorator.example2

// Implementação concreta de envio de mensagem simples
class SimpleMessage : Message {
    override fun send(content: String) {
        println("Enviando mensagem: $content")
    }
}
