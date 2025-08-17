fun main(args: Array<String>) {

//    val printer1 = Printer(lowerCaseFormatter)
//    val printer2 = Printer(upperCaseFormatter)
//
//    printer1.printString("FIFA Futbol")
//    printer2.printString("Android")

//    CommandProcessor()
//        .addToQueue(OrderAddCommand(1L))
//        .addToQueue(OrderAddCommand(2L))
//        .addToQueue(OrderPayCommand(3L))
//        .addToQueue(OrderPayCommand(4L))
//        .processCommands()
    val car1 = Car.Builder()
        .model("Chevrolet")
        .color("Black")
        .type("Yengil mashina")
        .build()

    println(car1)

}