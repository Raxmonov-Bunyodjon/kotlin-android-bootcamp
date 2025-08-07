package Topshiriq2

fun main(args: Array<String>) {

    val worker1 = Teacher.getInfo()  // Default qiymatlar bilan
    val worker2 = Teacher.setInfo("Jasur", "Fizika", "Erkak", 5)  // Parametrlar bilan

    worker1.showInfo()
    println("--------")
    worker2.showInfo()
}