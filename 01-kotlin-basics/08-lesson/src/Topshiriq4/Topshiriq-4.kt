import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Butun sonlar nechta kirgizasiz: ")
    var N = scanner.nextInt()

    var massiv = mutableListOf<Int>()

    println("$N ta butun sonlarni kiriting: ")
    for (item in 1..N) {
        while (true) {
            print("$item-son: ")
            if (scanner.hasNextInt()) {
                val son = scanner.nextInt()
                massiv.add(son)
                break
            } else {
                println("Xatolik: Faqat butun son kiriting!")
                scanner.next()
            }
        }
    }
    var oxirgiToqSon: Int? = null
    for (item in massiv.size - 1 downTo 0) {
        if (massiv[item] % 2 != 0) {
            oxirgiToqSon = massiv[item]
            break
        }
    }
    var yangiMassiv = mutableListOf<Int>()

    if (oxirgiToqSon == null) {
        println("Massivda toq son yo`q. Massiv o`zgarishsiz")
        println(massiv)
    } else {
        for (son in massiv){
            if (son%2 !=0){
                yangiMassiv.add(son + oxirgiToqSon)
            }else{
                yangiMassiv.add(son)
            }
        }

        println("Toq sonlar oxirgi toq songa orttirilgan yangi massiv:")
        println(yangiMassiv)
    }

}