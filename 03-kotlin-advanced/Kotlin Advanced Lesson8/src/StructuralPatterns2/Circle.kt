package StructuralPatterns2

class Circle(color: Color): Shape(color) {
    override fun draw() {
        println("Doira chizildi: ${color.applyColor()}")
    }
}