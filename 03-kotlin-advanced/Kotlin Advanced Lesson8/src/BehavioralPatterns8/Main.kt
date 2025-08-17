package BehavioralPatterns8

fun main(args: Array<String>) {

    val player = MediaPlayer(StoppedState())

    player.pressButton() // Stop -> Play
    player.pressButton() // Play -> Pause
    player.pressButton() // Pause -> Play
}