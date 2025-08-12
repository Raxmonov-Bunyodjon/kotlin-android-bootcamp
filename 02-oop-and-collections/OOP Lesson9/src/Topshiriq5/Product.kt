package Topshiriq5

data class Product(val id: String, var name: String, var price: Double, var category: String){


    // id asosida unikal bo‘lishi uchun equals & hashCode
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Product) return false
        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    override fun toString(): String {
        return "Product(id='$id', name='$name', price=$price, category='$category')"
    }
}

