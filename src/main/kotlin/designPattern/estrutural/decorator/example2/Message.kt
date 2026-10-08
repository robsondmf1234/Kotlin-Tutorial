package org.example.designPattern.estrutural.decorator.example2

// Contrato base do segundo exemplo de Decorator aplicado a envio de mensagens.

// Interface base para envio de mensagens
interface Message {
    fun send(content: String)
}
