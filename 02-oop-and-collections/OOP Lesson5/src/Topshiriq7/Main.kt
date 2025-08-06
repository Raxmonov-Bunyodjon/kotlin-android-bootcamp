package Topshiriq7

fun main(args: Array<String>) {

    // 1. Kitoblar yaratish
    val book1 = Book(
        title = "Sherlock Holmes",
        author = "Arthur Conan Doyle",
        category = BookCategory.DETECTIVE,
        status = BookStatus.AVAILABLE
    )

    val book2 = Book(
        title = "Qorako'z Majnun",
        author = "Abdulla Qodiriy",
        category = BookCategory.FICTION,
        status = BookStatus.AVAILABLE
    )

    val book3 = Book(
        title = "Tarixiy Sarguzashtlar",
        author = "Islom Karimov",
        category = BookCategory.HISTORY,
        status = BookStatus.BORROWED
    )

    // 2. O‘quvchilar yaratish
    val reader1 = Reader("Bunyodjon Raxmonov", id = 1)
    val reader2 = Reader("Ozoda Karimova", id = 2)

    // 3. Kutubxona yaratish (kitoblar va o‘quvchilar bilan)
    val library = Library(
        name = "Xovos Tuman Kutubxonasi",
        address = "Sirdaryo viloyati, Xovos tumani",
        books = mutableListOf(book1, book2, book3),
        readers = mutableListOf(reader1, reader2)
    )

    println("======== KUTUBXONA MA’LUMOTLARI ========")
    println(library)
    println()

    // 4. Kitob izlash
    val foundBook = library.findBookByTitle("Sherlock Holmes")
    println("Qidirilgan kitob: $foundBook")
    println()

    // 5. Reader1 kitob olmoqda
    println(reader1.borrow(book1))
    println("Kitob holati: ${book1.status}")
    println()

    // 6. Reader1 kitobni qaytarmoqda
    println(book1.returnBook())
    println("Kitob holati: ${book1.status}")
    println()

    // 7. Staff (kutubxona xodimi) obyektini yaratish va ishlatish
    val staff = library.Staff()
    staff.name = "Dilshod Ahmedov"
    staff.position = "Administrator"
    println(staff.work())
}