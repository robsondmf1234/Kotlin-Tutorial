package projetoFinal

import projetoFinal.Board.perguntaNome
import projetoFinal.Board.showBoardEmpty

var moveUser = 0
var isValid = false

fun main() {

    println("  ------------------------------ ")
    println("| Welcome to TIC-TAC-TOE Game!  |")
    println("|    Pick a number from 0-8     |")
    println("  ------------------------------ ")

    perguntaNome()
    showBoardEmpty()

    Board.captureMove()
    Board.gerarJogadaCPU()
    Board.captureMove()
    Board.gerarJogadaCPU()

    Board.captureMove()
    Board.gerarJogadaCPU()
    Board.captureMove()
    Board.gerarJogadaCPU()

    Board.captureMove()
    Board.gerarJogadaCPU()
    Board.captureMove()
    Board.gerarJogadaCPU()


}


