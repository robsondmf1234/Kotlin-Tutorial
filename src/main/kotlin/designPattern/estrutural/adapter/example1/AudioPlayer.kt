package org.example.designPattern.estrutural.adapter.example1

// Implementação concreta de MediaPlayer para tocar arquivos de áudio.
class AudioPlayer : MediaPlayer {
    override fun play(fileName: String) {
        println("Tocando áudio: $fileName")
    }
}
