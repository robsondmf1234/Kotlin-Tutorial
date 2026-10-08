package org.example.designPattern.estrutural.adapter.example2

// Converte a interface do sistema legado para o contrato novo de pagamento.

// Adapter que permite o novo sistema usar o sistema antigo
class PaymentAdapter(private val oldPaymentSystem: OldPaymentSystem) : NewPaymentProcessor {
    override fun processPayment(amount: Double) {
        println("Adaptando pagamento para o sistema antigo...")
        oldPaymentSystem.pay(amount)
    }
}
