package StructuralPatterns7

// 3️⃣ Proxy obyekt (vositachi)
class ProxyVideo(private val fileName: String): Video {
    private var realVideo: RealVideo? = null

    override fun play() {
        // Video faqat kerak bo'lganda yuklanadi
        if (realVideo == null) {
            realVideo = RealVideo(fileName)
        }
        realVideo!!.play()
    }
}