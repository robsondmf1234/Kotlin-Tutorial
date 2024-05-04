package exception.exceptionalura.exceptionmodels.exception

class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente.") : Exception(mensagem)
