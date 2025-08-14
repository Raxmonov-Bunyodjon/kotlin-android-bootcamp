package Topshiriq5

class ContactServiceImpl: ContactService {

    private val contacts = HashMap<String, List<String>>()


    override fun addContact(name: String, numbers: List<String>) {
        contacts[name] = numbers
        println("Kontakt qo‘shildi: $name -> $numbers")
    }

    override fun printContactsAll() {
        if (contacts.isEmpty()) {
            println("Kontaktlar ro‘yxati bo‘sh")
        } else {
            println("Barcha kontaktlar:")
            for ((name, numbers) in contacts) {
                println("$name -> ${numbers.joinToString(", ")}")
            }
        }
    }

    override fun removeContact(name: String) {
        if (contacts.remove(name) != null) {
            println("Kontakt o‘chirildi: $name")
        } else {
            println("Kontakt topilmadi: $name")
        }
    }

    override fun editContact(oldName: String, newName: String, newNumbers: List<String>) {
        if (contacts.containsKey(oldName)) {
            contacts.remove(oldName)
            contacts[newName] = newNumbers
            println("✏ Kontakt yangilandi: $newName -> $newNumbers")
        } else {
            println("⚠ Kontakt topilmadi: $oldName")
        }
    }

    override fun searchContact(query: String) {
        val results = contacts.filter { (name, numbers) ->
            name.equals(query, ignoreCase = true) || numbers.any { it == query }
        }
        if (results.isEmpty()) {
            println("Kontakt topilmadi: $query")
        } else {
            println("Qidiruv natijasi:")
            for ((name, numbers) in results) {
                println("$name -> ${numbers.joinToString(", ")}")
            }
        }
    }
}