package Topshiriq1

open class Shape {
    private var color: String = "red"
    private var filled: Boolean = true

    constructor()

    constructor(color: String, filled: Boolean) {
        this.color = color
        this.filled = filled
    }

    fun getColor(): String = color
    fun isFilled(): Boolean = filled

    fun setColor(color: String) {
        this.color = color
    }

    fun setFilled(filled: Boolean) {
        this.filled = filled
    }

    override fun toString(): String {
        return "Shape(color='$color', filled=$filled)"
    }
}
