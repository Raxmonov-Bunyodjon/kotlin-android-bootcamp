package contact

import java.util.Scanner

class ContactServiceImpl : ContactService {

    private val contactSet = HashSet<Contact>()
    private val scanner = Scanner(System.`in`)

    override fun addContact() {
        println("Kontact nomini kiriting:")
        val contactName = scanner.next()

        println("Kontact raqamini kiriting:")
        val numbers = mutableListOf(scanner.next())

        while (true) {
            println("Yana bitta kontakt raqamini qo'shmoqchimisiz? (1 = ha, 0 = yo'q)")
            val choice = scanner.nextInt()
            if (choice == 1) {
                println("Yangi raqam kiriting:")
                numbers.add(scanner.next())
            } else {
                break
            }
        }

        val contact = Contact(contactName, numbers)
        contactSet.add(contact)
        println("Muvaffaqiyatli qo'shildi!")
    }

    override fun listContacts() {
        if (contactSet.isEmpty()) {
            println("Kontaktlar ro'yxati bo'sh!")
        } else {
            contactSet.forEach { println(it) }
        }
    }

    override fun removeContact() {
        println("O'chiriladigan kontakt nomini kiriting:")
        val name = scanner.next()
        val removed = contactSet.removeIf { it.contactName == name }

        if (removed) {
            println("Muvaffaqiyatli o'chirildi!")
        } else {
            println("Kontakt topilmadi!")
        }
    }

    override fun editContact() {
        println("O'zgartiriladigan kontakt nomini kiriting:")
        val name = scanner.next()

        val oldContact = contactSet.find { it.contactName == name }
        if (oldContact == null) {
            println("Kontakt topilmadi!")
            return
        }

        contactSet.remove(oldContact)

        println("Yangi kontakt nomini kiriting:")
        val newName = scanner.next()
        println("Yangi raqamni kiriting:")
        val numbers = mutableListOf(scanner.next())

        while (true) {
            println("Yana bitta raqam qo'shmoqchimisiz? (1 = ha, 0 = yo'q)")
            val choice = scanner.nextInt()
            if (choice == 1) {
                println("Yangi raqam kiriting:")
                numbers.add(scanner.next())
            } else {
                break
            }
        }

        contactSet.add(Contact(newName, numbers))
        println("Kontakt muvaffaqiyatli yangilandi!")
    }

    override fun searchContact() {
        println("Qidirilayotgan nom yoki raqamni kiriting:")
        val query = scanner.next()

        val results = contactSet.filter {
            it.contactName.contains(query, ignoreCase = true) ||
                    it.contactNumbers.any { num -> num.contains(query) }
        }

        if (results.isEmpty()) {
            println("Hech narsa topilmadi!")
        } else {
            results.forEach { println(it) }
        }
    }
}
