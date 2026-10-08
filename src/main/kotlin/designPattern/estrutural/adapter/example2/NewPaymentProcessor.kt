package org.example.designPattern.estrutural.adapter.example2

// Define a interface nova esperada pelo fluxo de pagamento.

// Nova interface que queremos usar
interface NewPaymentProcessor {
    fun processPayment(amount: Double)
}
