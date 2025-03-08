package org.example.designPattern.estrutural.adapter.example1

// Função principal para testar o Adapter.
fun main() {
    val audioPlayer = AudioPlayer()  // Criando um tocador de áudio
    val videoPlayer = VideoAdapter(VideoPlayer())  // Adaptando VideoPlayer para MediaPlayer

    // Agora podemos usar ambos como MediaPlayer, sem modificar a classe VideoPlayer.
    audioPlayer.play("musica.mp3")
    videoPlayer.play("filme.mp4")
}
