package Topshiriq2

class Rectangle {
    private var length: Float = 3.0f
    private var width: Float = 4.0f


    constructor()

    constructor(length: Float, width: Float) {
        this.length = length
        this.width = width
    }


    fun getLength(): Float {
        return length
    }

    fun setLength(length: Float) {
        this.length = length
    }

    fun getWidth(): Float {
        return width
    }

    fun setWidth(width: Float) {
        this.width = width
    }

    fun getArea(): Double {
        return width.toDouble() * length.toDouble()
    }

    fun getPerimeter(): Double {
        return (width + length) * 2.0
    }

    override fun toString(): String {
        return "Rectangle(length=$length, width=$width)"
    }
}