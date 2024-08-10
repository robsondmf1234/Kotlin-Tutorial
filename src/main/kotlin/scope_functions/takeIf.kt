package org.example.scope_functions


//Exemplo de uso do takeIf
//val result = personWithAddressNull.takeIf { it.address != null } ?: personWithAddressNull.copy(address = ENDERECO_PADRAO)
// println(result) //Imprime o result que será o objeto personWithAddressNull com o endereço padrão preenchido, caso o endereço seja nulo
fun main() {
    val listOfPerson = createPerson()

    showExampleTakeIf(listOfPerson)
    showExampleTakeUnless(listOfPerson)
    listOfPerson.forEach {
    }

}

fun showExampleTakeUnless(listOfPerson: List<Person>) {
    listOfPerson.forEach {
        //Método takeUnless retorna o objeto se a condição for falsa, caso contrário retorna null
        //Método copy cria uma cópia do objeto com os valores passados como parâmetro
        val resultTakeUnless = it.takeUnless { it.address == null } ?: it.copy(address = ENDERECO_PADRAO)
        println(resultTakeUnless)

    }

}

fun showExampleTakeIf(listOfPerson: List<Person>) {
    //Método takeIf retorna o objeto se a condição for verdadeira, caso contrário retorna null
    //Método copy cria uma cópia do objeto com os valores passados como parâmetro
    listOfPerson.forEach {
        val resultTakeIf = it.takeIf { it.address != null } ?: it.copy(address = ENDERECO_PADRAO)
        println(resultTakeIf)
    }
    println()

}

private fun createPerson() = listOf(
    Person(name = "Robson", age = 35, address = "Rua 1"),
    Person(name = "Douglas", age = 35, address = "Rua 2"),
    Person(name = "Alice", age = 28, address = null)
)

data class Person(
    val name: String,
    val age: Int,
    val address: String?
)

const val ENDERECO_PADRAO = "Rua do Limoeiro, 250 - Pq dos Jardins - Campinas-SP"