package CreationalPatterns5

fun main(args: Array<String>) {

    // 1. Asl obyektlar
    val circle = Circle(10)
    val square = Square(5)
    val triangle = Triangle(6, 8)

    circle.draw()
    square.draw()
    triangle.draw()

    println("\n--- Nusxalashdan keyin ---")

    // 2. Nusxa olish (Prototype)
    val circleClone = circle.clone()
    val squareClone = square.clone()
    val triangleClone = triangle.clone()

    circleClone.draw()
    squareClone.draw()
    triangleClone.draw()
}