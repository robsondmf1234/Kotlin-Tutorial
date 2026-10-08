package designPattern.comportamentais.strategy.example2.strategy

// Contexto do Strategy que recebe uma plataforma e delega a reproducao para ela.

class Player {
    fun play(platform: Plataform) {
        platform.play()
    }
}
