package Topshiriq7

data class Reader(
    var fullName: String,
    var id: Int,
    var borrowedBook: MutableList<Book> = mutableListOf()
){

    fun borrow(book: Book) = borrowedBook.add(book)

    fun returnBook(book: Book) = borrowedBook.remove(book)
}
