package Topshiriq1

class Circle: Shape {

    private var radius: Double = 1.0

    constructor() : super()

    constructor(radius: Double) : super() {
        this.radius = radius
    }

    constructor(color: String, filled: Boolean, radius: Double) : super(color, filled) {
        this.radius = radius
    }

    fun getRadius(): Double = radius


    fun setRadius(radius: Double) {
        this.radius = radius
    }

    fun getArea(): Double = Math.PI*radius*radius

    fun getPerimeter(): Double = Math.PI*2*radius

    override fun toString(): String {
        return "Circle(radius=$radius)"
    }
}