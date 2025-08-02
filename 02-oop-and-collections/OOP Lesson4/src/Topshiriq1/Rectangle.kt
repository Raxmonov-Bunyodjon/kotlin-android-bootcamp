package Topshiriq1

class Rectangle: Shape() {

    private var length: Double = 3.0
    private var width: Double = 4.0

    override fun area(): Double = length*width

    override fun toString(): String = "Rectangle(length=$length, width=$width), Area: ${area()}, Color: ${getColor()}"
}