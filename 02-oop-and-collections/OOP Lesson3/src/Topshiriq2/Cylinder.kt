package Topshiriq2

class Cylinder: Circle {

    private var height: Double = 1.0

    constructor() : super()

    constructor(height: Double) : super() {
        this.height = height
    }

    constructor(radius: Double, color: String, height: Double) : super(radius, color) {
        this.height = height
    }


    fun getHeight(): Double = height
    fun setHeight(height: Double){
        this.height = height
    }

    fun getVolume(): Double = Math.PI * getRadius() * getRadius() * height

    override fun toString(): String {
        return "Cylinder(radius=${getRadius()}, color='${getColor()}', height=$height, volume=${getVolume()})"
    }


}