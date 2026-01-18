package org.example.lambdaFunctions

import kotlin.random.Random

fun setStatus(name: String) {
    println("Status atualizado para: $name")
}

fun isTurnedOn(isOn: Boolean) {
    println("Turn on and off  : $isOn")
}

fun main() {
    val handler = StatusHandler(
        onStatusUpdate = { name -> setStatus(name) },
        onReaderModeDisabled = { println("Modo de leitura desativado") },
        turnOnAndOff = { isOn -> isTurnedOn(isOn) }
    )

    handler.disableReaderMode()
}

class StatusHandler(
    private val onStatusUpdate: (String) -> Unit,
    private val onReaderModeDisabled: () -> Unit,
    private val turnOnAndOff: (Boolean) -> Unit
) {
    var cont = Random.nextInt()

    init {
        setName("Desligado")
        if (cont % 2 == 0) {
            turnOnAndOff(true)
        } else {
            turnOnAndOff(false)
        }
    }

    fun setName(name: String) {
        onStatusUpdate(name)
    }

    fun disableReaderMode() {
        onReaderModeDisabled()
    }
}
