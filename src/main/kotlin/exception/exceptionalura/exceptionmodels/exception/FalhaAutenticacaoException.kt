package exception.exceptionalura.exceptionmodels.exception

// Define a excecao usada quando a autenticacao da conta falha no dominio Bytebank.

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticação"
) : Exception(mensagem)
