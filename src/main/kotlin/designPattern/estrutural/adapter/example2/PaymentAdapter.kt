package org.example.designPattern.estrutural.adapter.example2

// Adapter que permite o novo sistema usar o sistema antigo
class PaymentAdapter(private val oldPaymentSystem: OldPaymentSystem) : NewPaymentProcessor {
    override fun processPayment(amount: Double) {
        println("Adaptando pagamento para o sistema antigo...")
        oldPaymentSystem.pay(amount)
    }
}