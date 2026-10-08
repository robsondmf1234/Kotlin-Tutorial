package org.example.designPattern.estrutural.adapter.example1

// Representa o componente existente com uma interface incompatível com o cliente.

// Classe incompatível que toca vídeos. Não implementa MediaPlayer diretamente.
class VideoPlayer {
    fun playVideo(fileName: String) {
        println("Tocando vídeo: $fileName")
    }
}
