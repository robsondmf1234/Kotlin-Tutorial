package org.example.designPattern.estrutural.adapter.example1

// Interface esperada pelo sistema. Define um contrato para tocar mídias.
interface MediaPlayer {
    fun play(fileName: String)
}