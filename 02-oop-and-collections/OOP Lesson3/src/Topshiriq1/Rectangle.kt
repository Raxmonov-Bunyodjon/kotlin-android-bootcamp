package Topshiriq1

class Rectangle: Shape {

    private var withd: Double = 1.0
    private var length: Double = 1.0

    constructor() : super()

    constructor(withd: Double, length: Double) : super() {
        this.withd = withd
        this.length = length
    }

    constructor(color: String, filled: Boolean, withd: Double, length: Double) : super(color, filled) {
        this.withd = withd
        this.length = length
    }

    fun getWidth(): Double = withd

    fun setWidth(Width: Double){
        this.withd = withd
    }

    fun getLength(): Double = length

    fun setLength(length: Double){
        this.length = length
    }

    fun getArea(): Double = withd*length

    fun getPerimeter(): Double = 2*withd*length

    override fun toString(): String {
        return "Rectangle(withd=$withd, length=$length)"
    }
}