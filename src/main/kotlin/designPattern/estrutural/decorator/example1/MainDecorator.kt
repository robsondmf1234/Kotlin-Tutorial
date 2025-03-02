package org.example.designPattern.estrutural.decorator.example1


// Função principal para demonstrar o uso da interface Coffee e suas implementações
fun main() {
    // Cria uma instância de SimpleCoffee
    val coffee = SimpleCoffee()
    // Imprime o custo do café simples
    println("Café simples: R$ ${coffee.cost()}")

    // Cria uma instância de MilkDecorator, envolvendo o café simples
    val coffeeWithMilk = MilkDecorator(coffee)
    // Imprime o custo do café com leite
    println("Café com leite: R$ ${coffeeWithMilk.cost()}")
}