package Topshiriq6

class ReadOnlyList<out T>(private val items: List<T>) {

    fun get(index: Int): T? = items.getOrNull(index)

    fun findFirst(p: (T) -> Boolean): T? = items.firstOrNull(p)

    fun findAll(p: (T) -> Boolean): ReadOnlyList<T> {
        return ReadOnlyList(items.filter(p))
    }

    fun getAll(): List<T> = items
}