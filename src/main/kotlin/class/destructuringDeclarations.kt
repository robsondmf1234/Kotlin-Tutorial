package `class`

fun main() {
    // Cria um Pair (par de valores) com 1 e "Robson"
    val pair = Pair(first = 1, second = "Robson")
    println("First: ${pair.first}")   // Imprime o primeiro valor do par
    println("Second: ${pair.second}") // Imprime o segundo valor do par

    // Desestrutura o Pair em duas variáveis: id e name
    val (id, name) = pair
    println("Id: $id")     // Imprime o id (1)
    println("Name: $name") // Imprime o nome ("Robson")

    // Cria uma instância de Person4
    val person = Person4(nome = "Robson", age = 35, address = "São Paulo,Brazil")
    // Desestrutura apenas o campo age, ignorando os outros com _
    val (_, age, _) = person
    println("Age: $age") // Imprime a idade (35)

    // Cria um Map com um par (1, "One")
    val map = mapOf(1 to "One")
    // Desestrutura cada entrada do Map em number e text
    for ((number, text) in map){
        println("Number: $number and Text: $text") // Imprime o número e o texto
    }
}

// Classe de dados com três propriedades: nome, idade e endereço
data class Person4(
    val nome: String,
    val age: Int,
    val address: String,
)