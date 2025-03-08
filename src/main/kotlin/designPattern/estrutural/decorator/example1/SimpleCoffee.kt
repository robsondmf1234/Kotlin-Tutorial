package org.example.designPattern.estrutural.decorator.example1

// Define a classe SimpleCoffee que implementa a interface Coffee
class SimpleCoffee : Coffee {
    // Sobrescreve o método cost para retornar o custo de um café simples
    override fun cost() = 5.0
}
