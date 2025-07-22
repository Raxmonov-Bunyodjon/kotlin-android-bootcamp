package `Topshiriq-1`

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Nechta natural son bo`lishi kerak: ")
    var N = scanner.nextInt()

    var sonN = IntArray(N)

    println("$N ta natural sonlarni kiriting: ")
    for (item in 0 until N) {
        while (true) {
            print("${item + 1}-son: ")
            var son = scanner.nextInt()
            if (son > 0) {
                sonN[item] = son
                break
            } else {
                println("X xatolik: Faqat natural son kiriting (1,2,3,4,,,,)")
            }
        }
    }

    println("Teskari tartibdagi sonlar:")
    for (item in sonN.reversed()) {
        println(item)
    }
}

