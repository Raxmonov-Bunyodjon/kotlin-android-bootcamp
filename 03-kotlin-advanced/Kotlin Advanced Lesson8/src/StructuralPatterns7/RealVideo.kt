package StructuralPatterns7

// 2️⃣ Haqiqiy obyekt (og‘ir ish qiladi)
class RealVideo(private val fileName: String): Video {

    init {
        loadFromDisk()
    }

    private fun loadFromDisk() {
        println("📂 '$fileName' videoni diskdan yuklayapti...")
    }

    override fun play() {
        println("▶️ '$fileName' videoni ijro etmoqda...")
    }
}