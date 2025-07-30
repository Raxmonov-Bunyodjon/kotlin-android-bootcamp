package Topshiriq1

fun main(args: Array<String>) {

    var circle = Circle("blue", true, 5.0)
    var square = Square(color = "Yellow", filled = false, side = 30.0)
    var shape = Shape(color = "Black", filled = true)
    var rectangle = Rectangle(color = "Green", filled = true, withd = 8.0, length = 6.0)

    // Eski qiymatlar
    println("Aylana, to'rtburchak, kvadrat, shakli(shape) haqida:")
    println("Radius aylanani: ${circle.getRadius()}")
    println("Yuza aylana: ${circle.getArea()}\nYuza kvadrat: ${square.getSide()}\nYuza to'rtburchak: ${rectangle.getArea()}")
    println("Perimetri: \naylana: ${circle.getPerimeter()}\nkvadrat: ${square.getPerimeter()}\nto'rtburchak: ${rectangle.getPerimeter()}")
    println("To'liq obyekt: \naylana: ${circle.toString()}\nkvadrat: ${square.toString()}\nto'rtburcha: ${rectangle.toString()}")
    println("Shape eski qiymati: ${shape}")

    // Qiymatlarni o‘zgartirish
    circle.setRadius(10.0)
    circle.setColor("green")
    circle.setFilled(false)
    rectangle.setWidth(20.0)
    rectangle.setLength(10.0)
    shape.setColor("Tea")
    shape.setFilled(false)
    square.setFilled(false)
    square.setColor("Malla")
    square.setLength(2.0)
    square.setWidth(4.0)
    square.setSide(3.0)


    // Yangi qiymatlar
    println("\nYangilangan aylana:")
    println("Radius: ${circle.getRadius()}")
    println("Yuza: \naylana: ${circle.getArea()}\nto`grtburchak: ${rectangle.getArea()}\nkvadrat: ${square.getArea()}")
    println("Color: \naylana: ${circle.getColor()}\nto'rtburchak: ${rectangle.getColor()}\nkvadrat: ${square.getColor()}\nShape shakli: ${shape.getColor()}")
    println("Perimetri: \naylana: ${circle.getPerimeter()}\nto'rtburchak: ${rectangle.getPerimeter()}\nkvadrat: ${square.getPerimeter()}")
    println("To'liq obyekt: \naylana: ${circle.toString()} \n To'rtburcha: ${rectangle.toString()}\n Kvadrat: ${square.toString()}\n Shape shakli: ${shape.toString()}")
}




