import java.util.Scanner

class ContactServiceImpl : ContactInterface {

    var scanner = Scanner(System.`in`)
    var contactList = arrayOfNulls<Contact>(100)

    var count = 0


    override fun addContact() {
        println("Contact name:")
        var contactName = scanner.next()
        println("Contact number:")
        var contactNumber = scanner.next()
        var contact = Contact(contactName, contactNumber)
        contactList[count++] = contact

    }

    override fun searchContact() {
        println("Contact number search:")
        var contactNumber = scanner.next()
        var found = false

        for (i in 0 until count) {
            val contact = contactList[i]
            if (contact != null && contact.contactNumber == contactNumber) {
                println("Contact found: Name: ${contact.contactName}, Number: ${contact.contactNumber} ")
                found = true
                break
            }
        }
        if (!found) {
            println("Contact with number $contactNumber not found.")
        }
    }

    override fun deleteContact() {
        println("O'chirilayotgan contact kiriting: ")
        val contactName = scanner.next()

        var isFound = false
        var indexToDelete = -1

        // Kontaktni topamiz
        for (i in 0 until count) {
            val contact = contactList[i]
            if (contact != null && contact.contactName == contactName) {
                isFound = true
                indexToDelete = i
                break
            }
        }

        if (isFound) {
            // O‘chirish — massivni chapga siljitish
            for (i in indexToDelete until count - 1) {
                contactList[i] = contactList[i + 1]
            }
            contactList[count - 1] = null // oxirgi elementni tozalaymiz
            count--

            println("Kontakt '$contactName' muvaffaqiyatli o'chirildi!")
        } else {
            println(" '$contactName' nomli kontakt topilmadi.")
        }
    }

    override fun editContact() {
        println("O'zgartirilayotgan contactni kiriting:")
        val contactName = scanner.next()

        var isFound = false
        var indexToEdit = -1

        // Kontaktni topamiz
        for (i in 0 until count) {
            val contact = contactList[i]
            if (contact != null && contact.contactName == contactName) {
                isFound = true
                indexToEdit = i
                break
            }
        }

        // Topilgan bo‘lsa – yangi ma'lumotlarni so‘rash va almashtirish
        if (isFound) {
            println("Yangi ismni kiriting:")
            val newName = scanner.next()
            println("Yangi raqamni kiriting:")
            val newNumber = scanner.next()

            // Yangi Contact obyekti yaratib o‘rniga qo‘yiladi
            contactList[indexToEdit] = Contact(newName, newNumber)

            println("Kontakt muvaffaqiyatli o‘zgartirildi!")
        } else {
            println("Bunday ismli kontakt topilmadi.")
        }
    }
}


