fun main(args: Array<String>) {

    var contactService = ContactServiceImpl()

    contactService.addContact()
    contactService.searchContact()
    contactService.deleteContact()
    contactService.editContact()


}