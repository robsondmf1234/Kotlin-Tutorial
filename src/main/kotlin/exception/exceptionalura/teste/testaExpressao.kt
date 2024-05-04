package teste

fun testaExpressao() {
    val entrada: String = "1.9"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: java.lang.NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()

        //Caso caia no catch retornará o valor 'null'
        null
    }
    if (valorRecebido != null) {
        println("Valor recebido: $valorRecebido")
    } else {
        println("Valor inválido")
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }
    println("Valor com taxa: $valorComTaxa")
}
