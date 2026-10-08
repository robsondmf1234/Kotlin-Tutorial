package org.example.designPattern.estrutural.adapter.example1

// Define a interface esperada pelo cliente no exemplo de Adapter.

// Interface esperada pelo sistema. Define um contrato para tocar mídias.
interface MediaPlayer {
    fun play(fileName: String)
}
