package BehavioralPatterns11

class Rectangle(val width: Double, val height: Double): Shape {
    override fun accept(visitor: ShapeVisitor) {
        visitor.visit(this)
    }
}