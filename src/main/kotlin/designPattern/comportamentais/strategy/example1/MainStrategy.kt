package designPattern.comportamentais.strategy.example1

import designPattern.comportamentais.strategy.example1.enuns.Priority
import designPattern.comportamentais.strategy.example1.transportestrategy.Aereo
import designPattern.comportamentais.strategy.example1.transportestrategy.Maritimo
import designPattern.comportamentais.strategy.example1.transportestrategy.Rodoviario


fun main() {
    // Criação de uma nova instância de FazerFrete
    val delivery = FazerFrete()

    // Loop de 0 a 30
    for (i in 0..30) {
        // Seleção aleatória de uma prioridade
        var prioridade: Priority = Priority.values().random()
        // Seleção aleatória de um tipo de transporte
        val random = (0..2).random()
        // Dependendo do valor aleatório, um tipo de transporte é selecionado e uma prioridade é definida
        when (random) {
            0 -> {
                // Se o valor aleatório for 0, o transporte rodoviário é selecionado e a prioridade é definida como baixa
                delivery.transporte = Rodoviario()
                prioridade = Priority.LOW
            }

            1 -> {
                // Se o valor aleatório for 1, o transporte marítimo é selecionado e a prioridade é definida como média
                delivery.transporte = Maritimo()
                prioridade = Priority.MEDIUM
            }

            2 -> {
                // Se o valor aleatório for 2, o transporte aéreo é selecionado e a prioridade é definida como alta
                delivery.transporte = Aereo()
                prioridade = Priority.HIGH
            }
        }
        // O frete é realizado com a prioridade definida
        delivery.fazerFrete(prioridade)
    }
}