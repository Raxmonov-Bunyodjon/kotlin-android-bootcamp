package Topshiriq1

fun main(args: Array<String>) {
    //Rasmda keltirilgan class maydonlari. konstruktorlari
// hamda funksiyalarini shakllantiring.


    var circle = Circle(4.0, "yellow")
    // Faqat qiymat olish:
    println("Radius (avvalgi): ${circle.getRadius()}")
    println("Color (avvalgi): ${circle.getColor()}")

    // Qiymatni o‘zgartirish:
    circle.setRadius(5.0)
    circle.setColor("Green")

    // Yangilangan qiymatlar:
    println("Radius (yangi): ${circle.getRadius()}")
    println("Color (yangi): ${circle.getColor()}")
    println("Area: ${circle.getArea()}")

    // toString() chaqirish
    println(circle.toString())

}
