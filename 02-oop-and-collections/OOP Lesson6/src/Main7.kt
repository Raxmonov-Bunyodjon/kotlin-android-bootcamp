fun main(args: Array<String>) {

    var a1 = Driver()
    a1.count = 10

    var a2 = Driver()
    a2.count = 5

    var a3 = Driver()
    a3.count = a1.addCar(a2.count)
    println(a3.count)
}