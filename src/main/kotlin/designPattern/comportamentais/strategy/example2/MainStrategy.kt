package designPattern.comportamentais.strategy.example2

// Executa o segundo exemplo de Strategy trocando a plataforma de reproducao.

import designPattern.comportamentais.strategy.example2.strategy.*

fun main() {
    //context
    val player = Player()
    player.play(Music())
    player.play(Video())
    player.play(Reels())
    player.play(Dvd())
}
