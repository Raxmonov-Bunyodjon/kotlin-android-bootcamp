package Topshiriq6

class ReadWriteList<T> {

    private val items = mutableListOf<T>()

    fun get (index: Int): T?= items.getOrNull(index)

    fun findFirst(p: (T) -> Boolean): T? = items.firstOrNull(p)

    fun findAll(p: (T) -> Boolean) : ReadWriteList<T>?{
        val result = ReadWriteList<T>()
        items.filter(p).forEach { result.add(it) }
        return result
    }

    fun add(item: T) {
        items.add(item)
        println("Elementlar qo'shildi: $item")
    }


    fun add(index: Int, item: T){
        if (index in 0..items.size){
            items.add(index, item)
        }
    }

    fun addAll(list: ReadWriteList<T>) {
        items.addAll(list.items)
    }

    fun getAll(): List<T> = items
}