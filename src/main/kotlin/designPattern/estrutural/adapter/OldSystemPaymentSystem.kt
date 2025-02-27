package designPattern.estrutural.adapter

// Sistema antigo de pagamento (não podemos modificar)
class OldPaymentSystem {
    fun pay(amount: Double) {
        println("Pagamento de R$ $amount realizado pelo sistema antigo.")
    }
}