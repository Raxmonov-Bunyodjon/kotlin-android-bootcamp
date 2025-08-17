package StructuralPatterns2

fun main(args: Array<String>) {

    val redCircle = Circle(RedColor())
    val greenSquare = Square(GreenColor())

    redCircle.draw()
    greenSquare.draw()
}