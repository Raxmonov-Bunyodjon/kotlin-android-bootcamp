package Topshiriq6

fun main(args: Array<String>) {

    var internet1: Internet = Success("Ma'lumotlar yuklandi")
    var internet2: Internet = Failure("Internet mavjud emas")
    var internet3: Internet = Loading


    operation(internet1)
    operation(internet2)
    operation(internet3)
}