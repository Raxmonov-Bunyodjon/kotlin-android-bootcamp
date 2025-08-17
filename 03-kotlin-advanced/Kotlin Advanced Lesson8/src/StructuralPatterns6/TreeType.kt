package StructuralPatterns6

// Flyweight - TreeType
class TreeType(val name: String, val color: String, val texture: String) {
    fun draw(x: Int, y: Int) {
        println("🌳 Daraxt turi: $name, rangi: $color, joylashuvi: ($x, $y)")
    }
}