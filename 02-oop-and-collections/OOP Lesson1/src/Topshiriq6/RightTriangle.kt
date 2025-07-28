package Topshiriq6

class RightTriangle (
    var legA: Double,
    var legB: Double,
//    var angleA: Double,
//    var angleB: Double
){
    fun calculateHypotenuse(): Double {
        return Math.sqrt(legA*legA + legB*legB)
    }
    fun calculateArea(): Double {
        return 0.5 * legA * legB
    }
    fun calculatePerimeter(): Double {
        return calculateHypotenuse() + legA + legB
    }
    fun displayInfo(){
        println("Leg A: $legA")
        println("Leg B: $legB")
        println("Hypotenuse: ${calculateHypotenuse()}")
        println("Area: ${calculateArea()}")
        println("Perimeter: ${calculatePerimeter()}")
    }
}

