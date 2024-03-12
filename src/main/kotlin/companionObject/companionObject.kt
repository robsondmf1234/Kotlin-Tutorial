package companionObject

//Demonstração do uso de companion object
//Tudo que fica dentro de bloco companion object vai ser visivel e acessivel a nivel de Classe,
// não a nivel de instancia
fun main() {
    //Function inside companion object
    println(Number.function2())
    println("Count = ${Number.count}")

    val number1 = Number()
    number1.incrementCount()
    println(number1.function())
    println("Count = ${Number.count}")

    val number2 = Number()
    number2.incrementCount()
    println("Count = ${Number.count}")
}

class Number {
    fun function() = "Fuction outside companion object."
    fun incrementCount() {
        ++count
    }

    companion object {
        var count = 0
        fun function2() = "Fuction inside companion object."
    }
}