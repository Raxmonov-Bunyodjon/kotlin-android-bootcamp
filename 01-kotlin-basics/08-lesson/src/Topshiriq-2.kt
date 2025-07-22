import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Nechta element son bo`lishi kerak: ")
    var N = scanner.nextInt()

    var son_N = mutableListOf<Int>()

    println("$N ta element natural sonlarni kiriting: ")
    for (item in 1..N) {
        while (true) {
            print("$item-son: ")
            var son = scanner.nextInt()
            if (son>0) {
                son_N.add(son)
                break
            } else {
                println("X xatolik: Faqat element natural sonlar kiriting (1,2,3,4,,,,)")
            }
        }
    }
    for (item in son_N.size-1 downTo 0) {
        if (son_N[item]%2!=0){
            son_N.removeAt(item)
        }
    }
    println("Toq sonlar o‘chirilgan holatda: $son_N")
    println("Elementlar soni: ${son_N.size}")
}