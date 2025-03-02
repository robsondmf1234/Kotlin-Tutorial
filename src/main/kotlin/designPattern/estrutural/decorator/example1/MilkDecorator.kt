package org.example.designPattern.estrutural.decorator.example1


// Define a classe MilkDecorator que implementa a interface Coffee e adiciona funcionalidade a um objeto Coffee existente
class MilkDecorator(private val coffee: Coffee) : Coffee {
    // Sobrescreve o método cost para adicionar o custo do leite ao custo do café existente
    override fun cost() = coffee.cost() + 2.0
}
