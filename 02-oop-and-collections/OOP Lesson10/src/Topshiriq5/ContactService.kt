package Topshiriq5

interface ContactService {

    fun addContact(name: String, numbers: List<String>)

    fun printContactsAll()

    fun removeContact(name: String)

    fun editContact(oldName: String, newName: String, newNumbers: List<String>)

    fun searchContact(query: String)

}