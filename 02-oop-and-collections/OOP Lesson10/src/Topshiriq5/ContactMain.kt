package Topshiriq5

import java.util.Scanner

fun main(args: Array<String>) {
    val contactService: ContactService = ContactServiceImpl()
    val scanner = Scanner(System.`in`)

    while (true) {
        println(
            """
            📞 Kontaktlar tizimi:
            1️⃣ Kontakt qo‘shish
            2️⃣ Barcha kontaktlarni ko‘rish
            3️⃣ Kontaktni o‘chirish
            4️⃣ Kontaktni tahrirlash
            5️⃣ Qidirish
            0️⃣ Chiqish
            Tanlang: 
            """.trimIndent()
        )

        when (scanner.nextLine()) {
            "1" -> {
                println("Ism kiriting:")
                val name = scanner.nextLine()

                println("1-raqamni kiriting:")
                val number1 = scanner.nextLine()

                println("Ikkinchi raqamni kiritasizmi? (ha/yo‘q)")
                val addSecond = scanner.nextLine()

                val numbers = mutableListOf(number1)
                if (addSecond.lowercase() == "ha") {
                    println("2-raqamni kiriting:")
                    numbers.add(scanner.nextLine())
                }

                contactService.addContact(name, numbers)
            }

            "2" -> {
                contactService.printContactsAll()
            }

            "3" -> {
                println("O‘chirish uchun kontakt ismini kiriting:")
                val name = scanner.nextLine()
                contactService.removeContact(name)
            }

            "4" -> {
                println("Tahrir qilinadigan kontakt ismi:")
                val oldName = scanner.nextLine()

                println("Yangi ism kiriting:")
                val newName = scanner.nextLine()

                println("Yangi 1-raqamni kiriting:")
                val number1 = scanner.nextLine()

                println("Ikkinchi raqam kiritasizmi? (ha/yo‘q)")
                val addSecond = scanner.nextLine()

                val newNumbers = mutableListOf(number1)
                if (addSecond.lowercase() == "ha") {
                    println("2-raqamni kiriting:")
                    newNumbers.add(scanner.nextLine())
                }

                contactService.editContact(oldName, newName, newNumbers)
            }

            "5" -> {
                println("Qidirish uchun ism yoki raqam kiriting:")
                val query = scanner.nextLine()
                contactService.searchContact(query)
            }

            "0" -> {
                println("Tizimdan chiqildi.")
                break
            }

            else -> println("⚠ Noto‘g‘ri tanlov!")
        }
    }
}