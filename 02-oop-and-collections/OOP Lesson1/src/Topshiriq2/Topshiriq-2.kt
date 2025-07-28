package Topshiriq2

fun main(args: Array<String>) {

    var order1 = Order()
    order1.id = 1
    order1.customerName = "Doston"
    order1.productName = "Big lavash"
    order1.quantity = 2.0
    order1.price = 40000.0
    order1.status = "Yangi"
    order1.date = "28-07-2025"

    var order2 = Order()
    order2.id = 2
    order2.customerName = "Jalol"
    order2.productName = "KFC BIG"
    order2.quantity = 1.0
    order2.price = 99000.0
    order2.status = "Yangi"
    order2.date = "28-07-2025"

    var order3 = Order()
    order3.id = 3
    order3.customerName = "Donyor"
    order3.productName = "Achchiq go'sht"
    order3.quantity = 1.0
    order3.price = 80000.0
    order3.status = "Yangi"
    order3.date = "28-07-2025"

    var order4 = Order()
    order4.id = 4
    order4.customerName = "Dilmurod"
    order4.productName = "Non kabob"
    order4.quantity = 1.0
    order4.price = 90000.0
    order4.status = "Yangi"
    order4.date = "28-07-2025"

    var order5 = Order()
    order5.id = 5
    order5.customerName = "Murodjon"
    order5.productName = "Qozon kabob"
    order5.quantity = 1.0
    order5.price = 99000.0
    order5.status = "Yangi"
    order5.date = "28-07-2025"


    order1.printSummary()
    order1.changeStatus("Yetkazildi")
    println("Yangi holat: ${order1.status}")
    println("*********************************")
    order2.printSummary()
    order2.changeStatus("Yetkazildi")
    println("Yangi holat: ${order2.status}")
    println("*********************************")
    order3.printSummary()
    order3.changeStatus("Yetkazildi")
    println("Yangi holat: ${order3.status}")
    println("*********************************")
    order4.printSummary()
    order4.changeStatus("Yetkazildi")
    println("Yangi holat: ${order4.status}")
    println("*********************************")
    order5.printSummary()
    order5.changeStatus("Yetkazildi")
    println("Yangi holat: ${order5.status}")


}