package designPattern.comportamentais.strategy.example1.transportestrategy

import designPattern.comportamentais.strategy.example1.enuns.Priority

// Definição da interface TransporteStrategy
interface TransporteStrategy {
    // Método abstrato fazendoTransporte que recebe um parâmetro do tipo Priority
    fun fazendoTransporte(prioridade: Priority)
}