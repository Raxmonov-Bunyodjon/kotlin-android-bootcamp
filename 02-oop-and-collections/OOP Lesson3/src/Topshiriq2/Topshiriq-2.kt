package Topshiriq2

fun main(args: Array<String>) {

    var circle = Circle(6.0,"Red")
    var cylinder = Cylinder(3.0,"Yellow",5.0)

    //Eski qiymatlari
    println("Eski holatdagisi: Cilindr ${cylinder}\nAylana: ${circle}")

    //O'zgarilishi
    cylinder.setRadius(10.0)
    circle.setRadius(2.0)
    cylinder.setHeight(9.0)
    cylinder.setColar("Kulirang")
    circle.setColar("Havorang")

    //yangilangan qiymatlari
    println(("Yuzi: \nSilindr: ${cylinder.getArea()}\nAylana: ${circle.getArea()}"))
    println(("Rangi: \nSilindr: ${cylinder.getColor()}\nAylana: ${circle.getColor()}"))
    println((": \nSilindr Ovoz chiqishini yuzi : ${cylinder.getVolume()}\nAylana: ${circle.getColor()}"))
    println(("Info ma'lumot: \nSilindr: ${cylinder.toString()}\nAylana: ${circle.toString()}"))
}