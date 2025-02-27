package org.example.designPattern.estrutural.adapter

import designPattern.estrutural.adapter.NewPaymentProcessor
import designPattern.estrutural.adapter.OldPaymentSystem

// Adapter que permite o novo sistema usar o sistema antigo
class PaymentAdapter(private val oldPaymentSystem: OldPaymentSystem) : NewPaymentProcessor {
    override fun processPayment(amount: Double) {
        println("Adaptando pagamento para o sistema antigo...")
        oldPaymentSystem.pay(amount)
    }
}