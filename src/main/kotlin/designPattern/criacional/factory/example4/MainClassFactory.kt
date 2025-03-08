package designPattern.criacional.factory.example4

// Define a classe PizzaFactory
class PizzaFactory {
    // Função para criar uma pizza com base no tipo fornecido
    fun createPizza(type: String): Pizza {
        // Retorna uma instância de pizza com base no tipo, ou lança uma exceção se o tipo for desconhecido
        return when (type.lowercase()) {
            "pepperoni" -> PepperoniPizza()
            "cheese" -> CheesePizza()
            else -> throw IllegalArgumentException("Unknown pizza type")
        }
    }
}

// Interface Pizza com a função bake
interface Pizza {
    fun bake()
}

// Classe PepperoniPizza que implementa a interface Pizza
class PepperoniPizza : Pizza {
    // Implementação da função bake para PepperoniPizza
    override fun bake() = println("Baking a Pepperoni Pizza")
}

// Classe CheesePizza que implementa a interface Pizza
class CheesePizza : Pizza {
    // Implementação da função bake para CheesePizza
    override fun bake() = println("Baking a Cheese Pizza")
}

// Função principal
fun main() {
    // Cria uma instância de PizzaFactory
    val factory = PizzaFactory()
    // Cria uma pizza do tipo "pepperoni" usando a fábrica
    val pizza = factory.createPizza("pepperoni")
    // Assa a pizza criada
    pizza.bake() // Output: Baking a Pepperoni Pizza
}