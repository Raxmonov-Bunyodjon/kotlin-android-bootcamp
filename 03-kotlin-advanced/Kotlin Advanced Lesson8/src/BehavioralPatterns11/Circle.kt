package BehavioralPatterns11

// 3. Concrete Element'lar
class Circle(val radius: Double): Shape {

    override fun accept(visitor: ShapeVisitor) {
        visitor.visit(this)
    }
}