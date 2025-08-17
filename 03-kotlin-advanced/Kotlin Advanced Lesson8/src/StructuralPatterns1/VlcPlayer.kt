package StructuralPatterns1

// 3️⃣ VLC Player
class VlcPlayer: AdvancedMediaPlayer {
    override fun playVlc(fileName: String) {
        println("Playing vlc file: $fileName")
    }

    override fun playMp4(fileName: String) {
        // hech narsa qilmaydi
    }
}