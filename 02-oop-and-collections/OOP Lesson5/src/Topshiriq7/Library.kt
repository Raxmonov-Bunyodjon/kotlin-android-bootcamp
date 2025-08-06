package Topshiriq7

class Library {

    var name: String = ""
    var address: String = ""
    var books: MutableList<Book> = mutableListOf()
    var readers: MutableList<Reader> = mutableListOf()

    constructor(name: String, address: String, books: MutableList<Book>, readers: MutableList<Reader>) {
        this.name = name
        this.address = address
        this.books = books
        this.readers = readers
    }


    fun addBook(book: Book) = books.add(book)
    fun removeBook(book: Book) = books.remove(book)
    fun registerReader(r: Reader) = readers.add(r)
    fun findBookByTitle(title: String) = books.find { it.title == title }

    override fun toString(): String {
        return "Library(name='$name', address='$address', books=$books, readers=$readers)"
    }


    inner class Staff{
        var name: String = ""
        var position: String = ""

        fun work(): String =  "$name is working as $position in the library."
    }
}