package Topshiriq5

class ContactServiceImpl : ContactService {
    private val contacts = mutableMapOf<String, MutableList<String>>() // name -> numbers
    private val numberMap = mutableMapOf<String, String>() // number -> "Bu raqam bor"

    override fun addContact(name: String, numbers: List<String>) {
        contacts[name] = numbers.toMutableList()

        // Har bir raqamni Mapga qo‘shamiz
        for (number in numbers) {
            numberMap[number] = "✅ Bu raqam bor"
        }

        println("📌 Kontakt qo‘shildi: $name")
    }

    override fun printContactsAll() {
        if (contacts.isEmpty()) {
            println("📭 Kontaktlar mavjud emas.")
            return
        }

        println("📋 Barcha kontaktlar:")
        contacts.forEach { (name, numbers) ->
            println("👤 $name: ${numbers.joinToString(", ")}")
        }
    }

    override fun removeContact(name: String) {
        val removed = contacts.remove(name)
        if (removed != null) {
            // Raqamlarni Mapdan ham o‘chiramiz
            removed.forEach { numberMap.remove(it) }
            println("🗑 Kontakt o‘chirildi: $name")
        } else {
            println("❌ Kontakt topilmadi.")
        }
    }

    override fun editContact(oldName: String, newName: String, newNumbers: List<String>) {
        val oldNumbers = contacts.remove(oldName)
        if (oldNumbers != null) {
            oldNumbers.forEach { numberMap.remove(it) }

            contacts[newName] = newNumbers.toMutableList()
            newNumbers.forEach { numberMap[it] = "✅ Bu raqam bor" }

            println("✏️ Kontakt tahrirlandi: $newName")
        } else {
            println("❌ Kontakt topilmadi.")
        }
    }

    override fun searchContact(query: String) {
        val byName = contacts.filterKeys { it.contains(query, ignoreCase = true) }
        val byNumber = contacts.filterValues { list -> list.any { it.contains(query) } }

        if (byName.isEmpty() && byNumber.isEmpty()) {
            println("🔍 Hech narsa topilmadi.")
        } else {
            println("🔎 Qidiruv natijalari:")
            (byName + byNumber).forEach { (name, numbers) ->
                println("👤 $name: ${numbers.joinToString(", ")}")
            }
        }

        // Map orqali raqam holatini ko‘rsatamiz
        val status = numberMap[query] ?: "❌ Bu raqam yo‘q"
        println("📱 Raqam holati: $status")
    }
}