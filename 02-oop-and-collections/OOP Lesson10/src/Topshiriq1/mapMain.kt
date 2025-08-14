package Topshiriq1

fun main(args: Array<String>) {

    var persons = mapOf("Bunyod" to "Raxmonov", "Baxodir" to "Mavlonov", "Bekzod" to "Raxmonov")


    for (key in persons.keys) {
        print(key)
        println(" ${persons[key]} ")
    }
}