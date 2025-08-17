package BehavioralPatterns8

// Holat: Play
class PlayingState: PlayerState {

    override fun pressButton(player: MediaPlayer) {
        println("⏸ Pause bosildi. Player pause holatiga o‘tdi.")
        player.state = PausedState()
    }
}