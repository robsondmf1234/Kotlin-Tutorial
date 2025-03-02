package org.example.designPattern.estrutural.decorator.example2

// Testando o padrão Decorator
fun main() {
    val message = SimpleMessage()  // Mensagem simples
    val encryptedMessage = EncryptedMessage(message)  // Mensagem com criptografia
    val compressedAndEncryptedMessage = CompressedMessage(encryptedMessage)  // Mensagem criptografada e comprimida

    println("---- Mensagem Simples ----")
    message.send("Olá, mundo!")

    println("\n---- Mensagem Criptografada ----")
    encryptedMessage.send("Olá, mundo!")

    println("\n---- Mensagem Criptografada e Comprimida ----")
    compressedAndEncryptedMessage.send("Olá, mundo!")
}