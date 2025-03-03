package org.example.designPattern.estrutural.adapter.example2

// Nova interface que queremos usar
interface NewPaymentProcessor {
    fun processPayment(amount: Double)
}