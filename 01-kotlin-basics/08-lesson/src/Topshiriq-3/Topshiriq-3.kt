package `Topshiriq-3`

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Nechta element son bo`lishi kerak: ")
    var N = scanner.nextInt()

    var massiv_N = mutableListOf<Double>()

    println("$N ta element natural sonlarni kiriting: ")
    for (item in 1..N) {
        while (true) {
            print("$item-son: ")
            var son = scanner.nextDouble()
            if (son>0) {
                massiv_N.add(son)
                break
            } else {
                println("X xatolik: Faqat element natural sonlar kiriting (1,2,3,4,,,,)")
            }
        }
    }
    var yangiMassiv = mutableListOf<Double>()
    for (item in 0 until massiv_N.size-1) {
        var ortacha = (massiv_N[item] + massiv_N[item+1])/2
        yangiMassiv.add(ortacha)
        }
    yangiMassiv.add(massiv_N.last())
    println("O‘zgartirilgan massiv (o‘ng qo‘shni bilan o‘rtachasi):")
    println(yangiMassiv)
    println("Elementlar soni: ${yangiMassiv.size}")
}