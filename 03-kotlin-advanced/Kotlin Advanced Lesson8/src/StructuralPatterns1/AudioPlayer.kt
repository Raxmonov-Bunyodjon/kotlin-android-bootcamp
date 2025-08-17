package StructuralPatterns1

// 6️⃣ Asosiy AudioPlayer (faqat mp3 uchun)
class AudioPlayer: MediaPlayer {
    private var mediaAdapter: MediaAdapter? = null

    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("mp3", ignoreCase = true)) {
            println("Playing mp3 file: $fileName")
        } else if (audioType.equals("vlc", ignoreCase = true) ||
            audioType.equals("mp4", ignoreCase = true)) {
            mediaAdapter = MediaAdapter(audioType)
            mediaAdapter?.play(audioType, fileName)
        } else {
            println("Invalid media. $audioType format not supported")
        }
    }
}