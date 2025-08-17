package CreationalPatterns5

// Doira klassi
class Circle(private val radius: Int): Shape {
    override fun draw() {
        println("Doira chizildi (radius = $radius)")
    }

    override fun clone(): Shape {
        return Circle(radius) // radius qiymatini nusxalayapti
    }
}