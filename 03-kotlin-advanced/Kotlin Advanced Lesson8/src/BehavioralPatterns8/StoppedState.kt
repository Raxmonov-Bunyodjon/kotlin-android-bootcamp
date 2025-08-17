package BehavioralPatterns8

// Holat: Stop
class StoppedState: PlayerState {

    override fun pressButton(player: MediaPlayer) {
        println("▶ Play bosildi. Player o‘ynashni boshladi.")
        player.state = PlayingState()
    }
}