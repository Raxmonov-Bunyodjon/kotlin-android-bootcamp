package StructuralPatterns1

// 4️⃣ MP4 Player
class Mp4Player: AdvancedMediaPlayer {
    override fun playVlc(fileName: String) {
        // hech narsa qilmaydi
    }

    override fun playMp4(fileName: String) {
        println("Playing mp4 file: $fileName")
    }
}