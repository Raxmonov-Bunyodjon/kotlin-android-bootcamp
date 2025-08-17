package BehavioralPatterns8

// Holat: Pause
class PausedState: PlayerState {

    override fun pressButton(player: MediaPlayer) {
        println("▶ Play bosildi. Player yana o‘ynashni boshladi.")
        player.state = PlayingState()
    }
}