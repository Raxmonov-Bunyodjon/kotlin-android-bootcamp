package BehavioralPatterns11

// 4. Concrete Visitor — chizish
class DrawVisitor: ShapeVisitor {
    override fun visit(circle: Circle) {
        println("Drawing Circle with radius ${circle.radius}")
    }

    override fun visit(rectangle: Rectangle) {
        println("Drawing Rectangle with width ${rectangle.width} and height ${rectangle.height}")
    }
}