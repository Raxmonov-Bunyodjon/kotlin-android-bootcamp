package Topshiriq1

class Circle: Shape() {

    private var radius: Double = 3.0

    override fun area(): Double = Math.PI*radius*radius

    override fun toString(): String = "Area: ${area()}, Radius: ${radius}. Color: ${getColor()}"
}