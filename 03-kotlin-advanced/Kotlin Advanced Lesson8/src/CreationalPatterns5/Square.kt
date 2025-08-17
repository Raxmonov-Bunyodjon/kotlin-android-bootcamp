package CreationalPatterns5

// Kvadrat klassi
class Square(private val side: Int): Shape {
    override fun draw() {
        println("Kvadrat chizildi (tomon = $side)")
    }

    override fun clone(): Shape {
        return Square(side) // side qiymatini nusxalayapti
    }
}