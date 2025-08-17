package StructuralPatterns2

class Square(color: Color) : Shape(color) {
    override fun draw() {
        println("Kvadrat chizildi: ${color.applyColor()}")
    }
}