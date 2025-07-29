package Topshiriq2

fun main(args: Array<String>) {

    var rectangle = Rectangle(length = 7.0f, width = 5.0f)

    // Faqat qiymat olish:
    println("Length (avvalgi): ${rectangle.getLength()}")
    println("Width (avvalgi): ${rectangle.getWidth()}")

    // Qiymatni o‘zgartirish:
    rectangle.setLength(8.0f)
    rectangle.setWidth(3.0f)

    // Yangilangan qiymatlar:
    println("Length (yangi): ${rectangle.getLength()}")
    println("Width (yangi): ${rectangle.getWidth()}")
    println("Area: ${rectangle.getArea()}")

    // toString() chaqirish
    println(rectangle.toString())

}