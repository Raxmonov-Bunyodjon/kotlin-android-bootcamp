package Topshiriq1

import kotlin.random.Random

fun main(args: Array<String>) {
//setOf ishtirokida kichik loyiha yarating

    var clup1 = setOf("Bunyodjon","Murodjon","Dilmurod","Asilbek","Diyorbek")
    var club2 = clup1.sorted()

    var number1 = setOf<Any>(10, "Messi", 7, "Ronado",17, "Nani")
    var number2 = number1

    for (s: Any in number2) {
        println(s)
    }

    for (s in club2) {
        println(s)
    }
}