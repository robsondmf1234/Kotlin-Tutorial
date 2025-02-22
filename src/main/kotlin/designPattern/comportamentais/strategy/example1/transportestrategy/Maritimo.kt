package designPattern.comportamentais.strategy.example1.transportestrategy

import designPattern.comportamentais.strategy.example1.enuns.Priority
import designPattern.comportamentais.strategy.example1.transportestrategy.TransporteStrategy

// Definição da classe Maritimo que implementa a interface TransporteStrategy
class Maritimo : TransporteStrategy {
    // Implementação do método fazendoTransporte da interface TransporteStrategy
    override fun fazendoTransporte(prioridade: Priority) {
        // Impressão de uma mensagem indicando que o transporte está sendo feito pelos mares e a prioridade do transporte
        println("Estou fazendo transporte pelos mares. Prioridade: $prioridade")
    }
}