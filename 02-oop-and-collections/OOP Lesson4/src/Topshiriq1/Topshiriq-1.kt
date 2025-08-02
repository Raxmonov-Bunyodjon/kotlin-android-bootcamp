package Topshiriq1

fun main(args: Array<String>) {

    var circle = Circle()
    var rectangle = Rectangle()

    //Ayalana va to'rtburchak yuzi eski holatda
    println("Yuzi: \nAylanani: ${circle.area()},\nTo'rtburchakni: ${rectangle.area()}")
    //To String chiqarish classlar haqida info
    println("Aylana: \nAylanani ma'lumot: ${circle.toString()},\nTo'rtburchakni ma'lumot: ${rectangle.toString()}")
}