package org.example.designPattern.estrutural.adapter.example1

// Adapter que permite que VideoPlayer seja usado como MediaPlayer.
class VideoAdapter(private val videoPlayer: VideoPlayer) : MediaPlayer {
    override fun play(fileName: String) {
        videoPlayer.playVideo(fileName)  // Adaptando a chamada de play() para playVideo()
    }
}