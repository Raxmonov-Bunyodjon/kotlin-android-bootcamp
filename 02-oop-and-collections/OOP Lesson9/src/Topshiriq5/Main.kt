package Topshiriq5

import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val service: ProductService = ProductServiceImpl()

    while (true) {
        println(
            """
            |1. Add product
            |2. Update product
            |3. Remove product
            |4. Find product
            |5. List all products
            |0. Exit
        """.trimMargin()
        )
        print("Tanlang: ")
        when (scanner.nextInt()) {
            1 -> {
                print("ID: "); val id = scanner.next()
                print("Name: "); val name = scanner.next()
                print("Price: "); val price = scanner.nextDouble()
                print("Category: "); val category = scanner.next()
                val added = service.add(Product(id, name, price, category))
                println(if (added) "Mahsulot qo'shildi!" else "Bunday ID mavjud!")
            }
            2 -> {
                print("ID (yangilash): "); val id = scanner.next()
                print("Name: "); val name = scanner.next()
                print("Price: "); val price = scanner.nextDouble()
                print("Category: "); val category = scanner.next()
                val updated = service.update(Product(id, name, price, category))
                println(if (updated) "Mahsulot yangilandi!" else "Bunday ID topilmadi!")
            }
            3 -> {
                print("O'chirish uchun ID: "); val id = scanner.next()
                val removed = service.remove(id)
                println(if (removed) "O'chirildi!" else "Bunday ID topilmadi!")
            }
            4 -> {
                print("Qidirish uchun ID: "); val id = scanner.next()
                val found = service.find(id)
                println(found ?: "Topilmadi!")
            }
            5 -> {
                val all = service.listAll()
                if (all.isEmpty()) println("Mahsulotlar ro‘yxati bo‘sh!") else all.forEach { println(it) }
            }
            0 -> {
                println("Dastur tugadi.")
                break
            }
            else -> println("Noto'g'ri tanlov!")
        }
        println()
    }
}