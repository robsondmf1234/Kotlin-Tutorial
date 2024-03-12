package `object`

//Demonstração do uso de Object
//Object é utilizado quando , precisamos ter uma instancia só de um objeto , durante o uso do software
// Dessign Petter Singleton, quando um objeto é custoso de ser criado ou quando faz o sentido mantermos uma unica
// instancia afim de mantermos consistencia de dados.
//Obs:Object não possui lista de parametros pois o mesmo não pode ter construtor
fun main() {

    println(Counter.currentCount())
    increment()
    println(Counter.currentCount())
    increment2()
    println(Counter.currentCount())

}

object Singleton {
    init {
        println("Teste")
    }

    fun printName(name: String) {
        println("My name is $name")
    }
}

object Counter {
    private var count = 0
    fun currentCount() = count
    fun increment() {
        ++count
    }
}

//Função para chamar o Singleton e incrementar a variavel count
fun increment() {
    Counter.increment()
}