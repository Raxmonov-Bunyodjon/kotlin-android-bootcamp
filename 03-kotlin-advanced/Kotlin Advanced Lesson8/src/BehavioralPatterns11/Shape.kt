package BehavioralPatterns11

// 2. Shape interfeysi (Visitor'ni qabul qiluvchi)
interface Shape {

    fun accept(visitor: ShapeVisitor)
}