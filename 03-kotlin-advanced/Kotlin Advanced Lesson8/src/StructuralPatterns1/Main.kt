package StructuralPatterns1

fun main(args: Array<String>) {

    val audioPlayer = AudioPlayer()

    audioPlayer.play("mp3", "song1.mp3")
    audioPlayer.play("mp4", "movie1.mp4")
    audioPlayer.play("vlc", "video1.vlc")
    audioPlayer.play("avi", "old_movie.avi") // support qilinmagan format
}