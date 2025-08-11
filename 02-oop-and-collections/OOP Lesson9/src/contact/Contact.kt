package contact

class Contact {
    var contactName: String = ""
    var contactNumbers: MutableList<String> = mutableListOf()

    constructor(contactName: String, contactNumbers: MutableList<String>) {
        this.contactName = contactName
        this.contactNumbers = contactNumbers
    }

    override fun toString(): String {
        return "Contact(contactName='$contactName', contactNumbers=$contactNumbers)"
    }
}