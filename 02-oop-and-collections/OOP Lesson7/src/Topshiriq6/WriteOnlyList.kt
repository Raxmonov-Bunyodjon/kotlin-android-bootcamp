package Topshiriq6

class WriteOnlyList<in T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun add(index: Int, item: T) {
        if (index in 0..items.size) {
            items.add(index, item)
        }
    }

    fun addAll(vararg itemsToAdd: T) {
        items.addAll(itemsToAdd)
    }

    // Test uchun ichini ko‘rish
    fun getHidden(): List<@UnsafeVariance T> = items
}