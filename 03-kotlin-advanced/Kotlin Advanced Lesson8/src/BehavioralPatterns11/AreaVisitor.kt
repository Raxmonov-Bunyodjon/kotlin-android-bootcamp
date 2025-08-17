package BehavioralPatterns11

class AreaVisitor: ShapeVisitor {
    override fun visit(circle: Circle) {
        val area = Math.PI * circle.radius * circle.radius
        println("Circle area: $area")
    }

    override fun visit(rectangle: Rectangle) {
        val area = rectangle.width * rectangle.height
        println("Rectangle area: $area")
    }
}