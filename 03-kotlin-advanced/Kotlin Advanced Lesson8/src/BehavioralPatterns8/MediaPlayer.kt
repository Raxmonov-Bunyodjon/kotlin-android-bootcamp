package BehavioralPatterns8

// Context class
class MediaPlayer(var state: PlayerState) {

    fun pressButton() {
        state.pressButton(this)
    }
}