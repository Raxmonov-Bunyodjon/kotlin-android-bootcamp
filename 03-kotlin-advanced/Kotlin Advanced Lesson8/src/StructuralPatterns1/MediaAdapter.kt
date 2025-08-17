package StructuralPatterns1

// 5️⃣ Adapter class
class MediaAdapter(private val audioType: String): MediaPlayer {

    private var advancedMediaPlayer: AdvancedMediaPlayer? = null

    init {
        if (audioType.equals("vlc", ignoreCase = true)) {
            advancedMediaPlayer = VlcPlayer()
        } else if (audioType.equals("mp4", ignoreCase = true)) {
            advancedMediaPlayer = Mp4Player()
        }
    }

    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("vlc", ignoreCase = true)) {
            advancedMediaPlayer?.playVlc(fileName)
        } else if (audioType.equals("mp4", ignoreCase = true)) {
            advancedMediaPlayer?.playMp4(fileName)
        }
    }
}