package org.example.designPattern.estrutural.adapter.example1

// Classe incompatível que toca vídeos. Não implementa MediaPlayer diretamente.
class VideoPlayer {
    fun playVideo(fileName: String) {
        println("Tocando vídeo: $fileName")
    }
}