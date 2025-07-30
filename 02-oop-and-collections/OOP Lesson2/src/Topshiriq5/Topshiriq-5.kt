package Topshiriq5

import java.awt.print.Book

fun main(args: Array<String>) {

    var autor1 = Author("Bunyodjon", "raxmonovbunyodjon5081999@gmail.com", 'M')
    var autor2 = Author("Bekzod", "raxmonovbekzod5041991@gmail.com", 'M')
    var autor3 = Author("Mahliyo", "mahliyo@gmail.com", 'F')

    var book1 = Book("Kotlin tez o'rganish", autor1, 50000.0, 1)
    var book2 = Book("Buxgalteriyani tez o'rganish", autor2, 60000.0, 5)
    var book3 = Book("Yuz parvarishi", autor3, 35000.0, 5)

    //Avvalgi narxi books va emaili
    println("Book1 (avvalgi) narxi ${book1}")
    println("Book2 (avvalgi) narxi ${book2}")
    println("Book3 (avvalgi) narxi ${book3}")


    //O'zgartirilayotgan books narixi O'zgartirilayotgan autor emaili va miqdorlari
    book1.setPrice(45000.0)
    book2.setPrice(55000.0)
    book3.setPrice(27000.0)
    book1.setQty(7)
    book2.setQty(15)
    book3.setQty(20)
    autor1.setEmail("bunyodjonraxmonov22@gmail.com")
    autor2.setEmail("bekzodraxmonov22@gmail.com")
    autor3.setEmail("mahliyo123mohi@gmail.com")


    //Yangilangan Autor emaili va kitoblar narxlari va midori
    println("Autori ismi: ${autor1.getName()}. Emaili: ${autor1.getEmail()} Kitobni yangi narxi:${book1.getPrice()}  va miqdori yangi ${book1.getQty()}")
    println("Autori ismi: ${autor2.getName()}. Emaili: ${autor2.getEmail()} Kitobni yangi narxi:${book2.getPrice()}  va miqdori yangi ${book2.getQty()}")
    println("Autori ismi: ${autor3.getName()}. Emaili: ${autor3.getEmail()} Kitobni yangi narxi:${book3.getPrice()}  va miqdori yangi ${book3.getQty()}")

    //toSring chiqarish
    println(autor1.toString())
    println(autor2.toString())
    println(autor3.toString())
    println(book1.toString())
    println(book2.toString())
    println(book3.toString())
}