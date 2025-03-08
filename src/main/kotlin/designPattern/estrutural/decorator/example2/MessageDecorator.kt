package org.example.designPattern.estrutural.decorator.example2

// Decorator base que implementa Message
abstract class MessageDecorator(private val message: Message) : Message {
    override fun send(content: String) {
        message.send(content)
    }
}



