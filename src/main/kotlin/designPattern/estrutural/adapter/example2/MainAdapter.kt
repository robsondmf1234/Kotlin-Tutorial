package org.example.designPattern.estrutural.adapter.example2

// Cliente que usa o novo sistema de pagamento
fun main() {
    val oldSystem = OldPaymentSystem()   // Criamos a instância do sistema antigo
    val paymentProcessor = PaymentAdapter(oldSystem) // Usamos o adapter para conectar os sistemas
    paymentProcessor.processPayment(100.0)  // Chamamos o método da nova interface
}