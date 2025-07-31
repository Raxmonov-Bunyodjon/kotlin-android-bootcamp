package Topshiriq2

open class Circle {
    private var radius: Double = 1.0
    private var color: String = "Yellow"

    constructor()

    constructor(radius: Double, color: String) {
        this.radius = radius
        this.color = color
    }


    open fun getRadius(): Double = radius
    open fun setRadius(radius: Double){
        this.radius = radius
    }
    open fun getColor(): String = color
    open fun setColar(color: String){
        this.color = color
    }

    open fun getArea(): Double = Math.PI* radius *radius

    override fun toString(): String {
        return "Circle(radius=$radius, color='$color' )"
    }


}