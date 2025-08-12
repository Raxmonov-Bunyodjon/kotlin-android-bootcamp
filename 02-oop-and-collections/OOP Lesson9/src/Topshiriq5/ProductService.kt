package Topshiriq5

interface ProductService {

    fun add(product: Product): Boolean
    fun remove(id: String): Boolean
    fun update(product: Product): Boolean
    fun find(id: String): Product?
    fun listAll(): List<Product>
}