package exception

//Demonstração do uso de Exceptions
//Lancamento de Exceptions em funções
fun main() {
//    errorCode()
    println(averageSalary(amount = 3000, months = 2))
    println(averageSalaryOrNull(amount = 1500, months = 10))
    println(averageSalaryOrException(amount = 68400, months = 12))
}

fun errorCode() {
    val invalidNumber = "#1"
    try {
        val result = invalidNumber.toInt()
    } catch (e: NumberFormatException) { //Lançamento de NumberFormatException ,quando não conseguir formatar o numero informado
        println("Impossible to convert this number in an Int.")
    } finally {
        println("Try with another number.")
    }
}

fun averageSalary(amount: Int, months: Int): Int {
    return amount / months
}

fun averageSalaryOrNull(amount: Int, months: Int) =
    if (amount == 0 || months == 0) null else amount / months

fun averageSalaryOrException(amount: Int, months: Int): Int {
    if (amount == 0) {
        throw IllegalArgumentException("Invlaid number passed for the 'amount' argument")
    }
    if (months == 0) {
        throw IllegalArgumentException("Invlaid number passed for the 'months' argument")
    } else {
        return amount / months
    }
}