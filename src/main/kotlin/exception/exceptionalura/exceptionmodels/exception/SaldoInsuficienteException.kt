package exception.exceptionalura.exceptionmodels.exception

// Define a excecao usada quando uma operacao bancaria tenta usar saldo indisponivel.

class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente.") : Exception(mensagem)
