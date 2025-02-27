package designPattern.estrutural.adapter

// Nova interface que queremos usar
interface NewPaymentProcessor {
    fun processPayment(amount: Double)
}