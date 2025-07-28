package Topshiriq5

import Topshiriq4.Price
import java.util.Scanner

fun main(args: Array<String>){

//Quyidagi atributlarga ega bo’lgan Metro nomli class yarating: jo’nash
// bekati; oxirgi bekat; yo’lda yurish vaqti; liniya raqami.
// 5 ta Metro toifasidagi elementdan iborat massiv tuzing. Yo’lda yurish vaqti berilgan
// vaqtdan katta bo’lmagan elementlarni ekranga chiqaring.
    val scanner = Scanner(System.`in`)
    val manager = MetroManager()
    manager.addMetro(Metro("Olmazor", "Buyuk Ipak Yo‘li", 22, 1))
    manager.addMetro(Metro("Chilonzor", "Novza", 15, 1))
    manager.addMetro(Metro("Yunusobod", "Shahriston", 12, 3))
    manager.addMetro(Metro("Do‘stlik", "Qo‘yliq", 10, 2))
    manager.addMetro(Metro("Hamid Olimjon", "Mustaqillik Maydoni", 8, 2))

    print("Maksimal yo‘lda yurish vaqtini kiriting (daqiqa): ")
    val maxTime = scanner.nextInt()

    val filteredList = manager.filterByTime(maxTime)
    manager.printAll(filteredList, maxTime)
}