package Topshiriq5

class ProductServiceImpl: ProductService {
    private val products = mutableSetOf<Product>()

    override fun add(product: Product): Boolean {
        return if (products.contains(product)) {
            false
        } else {
            products.add(product)
        }
    }

    override fun remove(id: String): Boolean {
        return products.removeIf { it.id == id }
    }

    override fun update(product: Product): Boolean {
        val existing = find(product.id)
        return if (existing != null) {
            products.remove(existing)
            products.add(product)
            true
        } else {
            false
        }
    }

    override fun find(id: String): Product? {
        return products.find { it.id == id }
    }

    override fun listAll(): List<Product> {
        return products.toList()
    }

}