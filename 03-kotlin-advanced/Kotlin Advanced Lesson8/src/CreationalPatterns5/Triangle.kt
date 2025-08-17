package CreationalPatterns5

// Uchburchak klassi
class Triangle(private val base: Int, private val height: Int): Shape {
    override fun draw() {
        println("Uchburchak chizildi (asos = $base, balandlik = $height)")
    }

    override fun clone(): Shape {
        return Triangle(base, height)
    }
}