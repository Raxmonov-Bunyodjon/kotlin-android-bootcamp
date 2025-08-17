package BehavioralPatterns11

fun main(args: Array<String>) {

    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Rectangle(4.0, 6.0)
    )

    val drawVisitor = DrawVisitor()
    val areaVisitor = AreaVisitor()

    println("=== Drawing Shapes ===")
    shapes.forEach { it.accept(drawVisitor) }

    println("\n=== Calculating Areas ===")
    shapes.forEach { it.accept(areaVisitor) }
}