package Topshiriq4

fun main(args: Array<String>) {

    val acc1 = Account("001", "Bunyodjon", 1000)
    val acc2 = Account("002", "Asil", 500)

    println("Boshlang'ich holat:")
    println(acc1)
    println(acc2)

    println("\n500 so'm Bunyodjondan Asilga o'tkazilmoqda...")
    acc1.transferTo(acc2, 500)

    println("\nYakuniy holat:")
    println(acc1)
    println(acc2)

}