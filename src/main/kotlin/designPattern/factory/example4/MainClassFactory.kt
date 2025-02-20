package org.example.designPattern.factory.example4

class PizzaFactory {
    fun createPizza(type: String): Pizza {
        return when (type.lowercase()) {
            "pepperoni" -> PepperoniPizza()
            "cheese" -> CheesePizza()
            else -> throw IllegalArgumentException("Unknown pizza type")
        }
    }
}

interface Pizza {
    fun bake()
}

class PepperoniPizza : Pizza {
    override fun bake() = println("Baking a Pepperoni Pizza")
}

class CheesePizza : Pizza {
    override fun bake() = println("Baking a Cheese Pizza")
}

fun main() {
    val factory = PizzaFactory()
    val pizza = factory.createPizza("pepperoni")
    pizza.bake() // Output: Baking a Cheese Pizza
}
