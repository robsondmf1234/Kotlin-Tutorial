package lambda

// Introduz a sintaxe basica de lambdas e formas de invocacao.

fun main() {
    println("Test")

    var list = (1..20).toList()
    println(list)
    val filtered  = list.filter { it % 2 == 0 }
    println(filtered)
    val filtered2 = list.filter { it > 8 }
    println(filtered2)
}
