fun main(args: Array<String>) {

    var car1 = Car()
    car1.name = "Captiva"
    car1.color = "Black"
    car1.company = "Chevrolet"
    car1.fuel = "Benzin"
    println(car1.name)
    println(car1.color)
    println(car1.company)
    println(car1.fuel)

    println("===============")

    var car2 = Car() //create new object
    car2.name = "Kamaz"
    car2.color = "White"
    car2.company = "Man"
    car2.fuel = "Dizel"

    println(car2.name)
    println(car2.color)
    println(car2.company)
    println(car2.fuel)

}