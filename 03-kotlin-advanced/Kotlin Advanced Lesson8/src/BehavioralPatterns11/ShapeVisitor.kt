package BehavioralPatterns11

// 1. Visitor interfeysi
interface ShapeVisitor {

    fun visit(circle: Circle)
    fun visit(rectangle: Rectangle)
}