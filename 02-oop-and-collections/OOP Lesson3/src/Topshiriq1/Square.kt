package Topshiriq1

class Square: Shape {

    private var side: Double = 1.0

    constructor() : super()

    constructor(side: Double) : super() {
        this.side = side
    }

    constructor(color: String, filled: Boolean, side: Double) : super(color, filled) {
        this.side = side
    }

    fun getSide(): Double = side

    fun setSide(side: Double){
        this.side = side
    }

    fun setWidth(side: Double){
        this.side = side
    }

    fun getArea(): Double = side*side
    fun getPerimeter(): Double = 4*side

    fun setLength(side: Double){
        this.side = side
    }

    override fun toString(): String {
        return "Square(side=$side)"
    }
}