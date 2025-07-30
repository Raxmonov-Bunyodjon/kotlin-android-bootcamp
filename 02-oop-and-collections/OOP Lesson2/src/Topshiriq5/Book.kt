package Topshiriq5

class Book {

    private var name: String = ""
    private var author: Author
    private var price: Double = 0.0
    private var qty: Int = 0

    constructor(name: String, author: Author, price: Double) {
        this.name = name
        this.author = author
        this.price = price
    }

    constructor(name: String, author: Author, price: Double, qty: Int) {
        this.name = name
        this.author = author
        this.price = price
        this.qty = qty
    }


    fun getName(): String = name
    fun getAutor(): Author = author
    fun getPrice(): Double = price

    fun setPrice(price:Double){
        this.price = price
    }

    fun getQty(): Int = qty

    fun setQty(qty: Int){
        this.qty = qty
    }

    override fun toString(): String {
        return "Book(name='$name', author=$author, price=$price, qty=$qty)"
    }


}