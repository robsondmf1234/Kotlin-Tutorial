package org.example.designPattern.estrutural.adapter.example2

// Sistema antigo de pagamento (não podemos modificar)
class OldPaymentSystem {
    fun pay(amount: Double) {
        println("Pagamento de R$ $amount realizado pelo sistema antigo.")
    }
}