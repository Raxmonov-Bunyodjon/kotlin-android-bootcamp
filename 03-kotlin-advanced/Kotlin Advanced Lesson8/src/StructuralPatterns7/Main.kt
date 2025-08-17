package StructuralPatterns7

// 4️⃣ Main funksiyada sinash
fun main(args: Array<String>) {

    val video1: Video = ProxyVideo("darslik.mp4")
    val video2: Video = ProxyVideo("film.mp4")

    // Faqat play chaqirilganda yuklanadi
    println("🎬 1-chi videoni chaqirdim:")
    video1.play()

    println("\n🎬 2-chi videoni chaqirdim:")
    video2.play()

    println("\n🎬 Yana 1-chi videoni qayta chaqirdim:")
    video1.play()
}