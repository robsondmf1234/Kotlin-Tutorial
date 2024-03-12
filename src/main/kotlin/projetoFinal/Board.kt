package projetoFinal


object Board {

    var positionUser = 0
    var name = ""
    var convertion = false

    var linhaA = arrayListOf<String?>(null, null, null)
    var linhaB = arrayListOf<String?>(null, null, null)
    var linhaC = arrayListOf<String?>(null, null, null)

    var historicoHumano = mutableListOf<String?>(null, null, null, null, null, null, null)
    var historicoCPU = mutableListOf<String?>(null, null, null, null, null, null, null)

    fun perguntaNome() {
        print("Choose Your Name: ")
        name = readLine().toString().capitalize()
        println("It´s your move, $name")
    }


    fun showBoardEmpty() {
        println()
        println(" -------")
        println("| _ _ _ |")
        println("| _ _ _ |")
        println("| _ _ _ |")
        println(" -------")
    }

    fun showName() {
        print("It´s your move $name: ")
    }

    fun verifyRange(moveUser: Int): Boolean {
        return moveUser in 0..8
    }

    fun jogadaHumano(position: Int) {
        positionUser = position
        when (position) {
            0, 1, 2 -> preencherJogadaHumana(position = positionUser, linha = linhaA)
            3, 4, 5 -> preencherJogadaHumana(position = positionUser, linha = linhaB)
            6, 7, 8 -> preencherJogadaHumana(position = positionUser, linha = linhaC)
        }
    }

    fun gerarJogadaCPU() {
        var cont = false
        var jogadaGerada = 0
        do {
            jogadaGerada = (0..8).random()

            when (jogadaGerada) {
                0 -> if (validaJogadaNoHistorico(position = 0, linhaA)) {
                    cont = true
                } else {
                    println("Jogada já realizada")
                }

                1 -> if (validaJogadaNoHistorico(position = 1, linhaA)) {
                    cont = true
                } else {
                    println("Jogada já realizada")
                }

                2 -> if (validaJogadaNoHistorico(position = 2, linhaA)) {
                    cont = true
                } else {
                    println("Jogada já realizada")
                }

                3 -> if (validaJogadaNoHistorico(position = 0, linhaB)) {
                    cont = true
                } else {
                    println("Jogada já realizada")
                }

                4 -> if (validaJogadaNoHistorico(position = 1, linhaB)) {
                    cont = true
                } else {
                    println("Jogada já realizada")
                }

                5 -> if (validaJogadaNoHistorico(position = 2, linhaB)) {
                    cont = true
                } else {
                    println("Jogada já realizada")
                }


                6 -> if (validaJogadaNoHistorico(position = 0, linhaC)) {
                    cont = true
                } else {
                    println("Jogada já realizada")
                }

                7 -> if (validaJogadaNoHistorico(position = 1, linhaC)) {
                    cont = true
                } else {
                    println("Jogada já realizada")
                }

                8 -> if (validaJogadaNoHistorico(position = 2, linhaC)) {
                    cont = true
                } else {
                    println("Jogada já realizada")
                }
            }
        } while (!cont)

        jogadaCPU(jogadaGerada)
    }

    private fun validaJogadaNoHistorico(position: Int, linha: ArrayList<String?>): Boolean {
        return linha[position].isNullOrBlank()
    }

    fun jogadaCPU(position: Int) {
        positionUser = position
        when (position) {
            0, 1, 2 -> preencherJogadaCPU(position = positionUser, linha = linhaA)
            3, 4, 5 -> preencherJogadaCPU(position = positionUser, linha = linhaB)
            6, 7, 8 -> preencherJogadaCPU(position = positionUser, linha = linhaC)
        }
    }

    private fun preencherJogadaCPU(position: Int, linha: ArrayList<String?>) {
        when (position) {
            0 -> validaJogadaCPU(position = 0, linha)
            1 -> validaJogadaCPU(position = 1, linha)
            2 -> validaJogadaCPU(position = 2, linha)
            3 -> validaJogadaCPU(position = 0, linha)
            4 -> validaJogadaCPU(position = 1, linha)
            5 -> validaJogadaCPU(position = 2, linha)
            6 -> validaJogadaCPU(position = 0, linha)
            7 -> validaJogadaCPU(position = 1, linha)
            8 -> validaJogadaCPU(position = 2, linha)
        }
    }

    private fun validaJogadaCPU(position: Int, linhaJogada: ArrayList<String?>) {
        if (linhaJogada[position].isNullOrBlank()) {
            preencherJogadaNoTabuleiro(position, linhaJogada, isHuman = false)
        } else {
            println("Jogada já realizada.")
            gerarJogadaCPU()
        }
        mostraTabuleiro()
    }

    private fun preencherJogadaHumana(position: Int, linha: ArrayList<String?>) {
        when (position) {
            0 -> validaJogada(position = 0, linha)
            1 -> validaJogada(position = 1, linha)
            2 -> validaJogada(position = 2, linha)
            3 -> validaJogada(position = 0, linha)
            4 -> validaJogada(position = 1, linha)
            5 -> validaJogada(position = 2, linha)
            6 -> validaJogada(position = 0, linha)
            7 -> validaJogada(position = 1, linha)
            8 -> validaJogada(position = 2, linha)
        }
    }

    private fun validaJogada(position: Int, linhaJogada: ArrayList<String?>) {
        if (linhaJogada[position].isNullOrBlank()) {
            preencherJogadaNoTabuleiro(position, linhaJogada, isHuman = true)
        } else {
            println("Jogada já realizada.")
            do {
                convertion = askHumanMovement()
            } while (!convertion)
        }
        mostraTabuleiro()
    }

    private fun insereJogadaNoHistoricoCPU() {
        println("Histórico Antes")
        println(historicoCPU)
        var cont = true

        historicoCPU.forEachIndexed { index, position ->
            if (position == null && cont) {
                println("Valor nulo - index: $index")
                historicoCPU[index] = positionUser.toString()
                cont = false
            }
        }
        println("Histórico Depois")
        println(historicoCPU)

    }

    private fun preencherJogadaNoTabuleiro(position: Int, linhaJogada: ArrayList<String?>, isHuman: Boolean) {
        if (isHuman) {
            linhaJogada[position] = "X"
            insereJogadaNoHistoricoHumano()
            mostraTabuleiro()
        } else {
            linhaJogada[position] = "0"
            insereJogadaNoHistoricoCPU()
            mostraTabuleiro()
        }
    }

    private fun insereJogadaNoHistoricoHumano() {
        println("HISTÓRICO HUMANO ANTES")
        println(historicoHumano)
        var cont = true

        historicoHumano.forEachIndexed { index, position ->
            if (position == null && cont) {
                println("Valor nulo - index: $index")
                historicoHumano[index] = positionUser.toString()
                cont = false
            }
        }
        println("HISTÓRICO HUMANO DEPOIS")
        println(historicoHumano)
        println()
    }

    fun convertRange(move: Int): Boolean {
        return move in 0..8
    }

    fun askHumanMovement(): Boolean {
        print("Insert your move: ")
        val moveUser = readLine()
        if (convertToInt(moveUser)) {
            return true
        } else {
            println("Invalid Number")
            return false
        }
    }

    fun convertToInt(moveUser: String?): Boolean {
        var isValid = false
        if (moveUser != null) {
            return try {
                val move = moveUser.toInt()
                isValid = convertRange(move)
                Board.jogadaHumano(move)
                isValid
            } catch (exception: NumberFormatException) {
                isValid
            }
        }
        return isValid
    }

    fun captureMove() {
        do {
            convertion = askHumanMovement()
        } while (!convertion)
    }

    private fun mostraTabuleiro() {
        println()
        println(linhaA)
        println(linhaB)
        println(linhaC)
        println()
    }
}