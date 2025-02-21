package designPattern.comportamentais.strategy.example1.transportestrategy

import designPattern.comportamentais.strategy.example1.enuns.Priority
import designPattern.comportamentais.strategy.example1.transportestrategy.TransporteStrategy

// Definição da classe Rodoviario que implementa a interface TransporteStrategy
class Rodoviario() : TransporteStrategy {

    // Implementação do método fazendoTransporte da interface TransporteStrategy
    override fun fazendoTransporte(priority: Priority) {
        // Impressão de uma mensagem indicando que o transporte está sendo feito por estradas e a prioridade do transporte
        println("Estou fazendo transporte por estradas. Prioridade: $priority")
    }
}