package designPattern.comportamentais.strategy.example1

// Contexto do exemplo Strategy que delega a execucao do frete para uma estrategia de transporte.

import designPattern.comportamentais.strategy.example1.enuns.Priority
import designPattern.comportamentais.strategy.example1.transportestrategy.TransporteStrategy

// Definição da classe FazerFrete
class FazerFrete {
    // Variável transporte do tipo TransporteStrategy que pode ser nula
    var transporte: TransporteStrategy? = null

    // Método fazerFrete que recebe um parâmetro do tipo Priority
    fun fazerFrete(prioridade: Priority) {
        // Chamada do método fazendoTransporte da variável transporte, se ela não for nula
        transporte?.fazendoTransporte(prioridade)
    }
}
