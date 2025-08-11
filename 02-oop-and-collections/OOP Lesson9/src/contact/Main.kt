package contact

import java.util.Scanner

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)
    var contactService = ContactServiceImpl()

    while (true) {

        println(
            "1->Kontakt qo'shish;" +
                    "2->Kontaktlar ro'yhati;" +
                    "3->Kontaktni o'chirish;" +
                    "4->Kontaktni o'zgartirish;" +
                    "5->Kontaktni qidirish."
        )
        var n = scanner.nextInt()

        when (n) {
            1 -> {
                contactService.addContact()
            }

            2 -> {
                contactService.listContacts()
            }

            3 -> {
                contactService.removeContact()
            }

            4 -> {
                contactService.editContact()
            }

            5 -> {
                contactService.searchContact()
            }
        }
    }
}