package exception

fun main() {
//    errorCode2()
    testTryCatch()
}

fun testTryCatch() {
    try {
        launchGenericError()
    } catch (e: CustomException) {
        println("Custom Exception captured")

    } catch (e: InvalidNumberException) {
        println("Invalid Number Exception")

    } catch (e: Exception) {
        //Adicionamos um catch capturando um erro do tipo Exception, para pegar qualqeur erro que não mapeamos
        // nos catchs anteriores pois a maioria dos erros herdam de Exception, a classe Exception herda da classe
        // do tipo  Throwable
        println("Generic Excpetion - unknwon error")
    } finally {
        println("Finally sempre será executado ,após passar pelo catch")
    }
}

fun launchThrowableException() {
    throw CustomException(description = "Aleatory error.")
}

fun launchInvalidNumberException() {
    throw InvalidNumberException(description = "Please enter the valid number.")
}

fun launchGenericError() {
    throw IllegalArgumentException("ArithmeticException")
}

class InvalidNumberException(description: String) : Exception(description)
class CustomException(description: String) : Throwable(description)
