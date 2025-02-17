package org.example.designPattern.strategy.example2

import org.example.designPattern.strategy.example2.strategy.*

fun main() {
    //context
    val player = Player()
    player.play(Music())
    player.play(Video())
    player.play(Reels())
    player.play(Dvd())
}