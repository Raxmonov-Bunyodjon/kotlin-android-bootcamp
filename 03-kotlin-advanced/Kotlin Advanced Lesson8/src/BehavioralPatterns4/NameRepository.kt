package BehavioralPatterns4

class NameRepository: Container<String> {
    private val names = arrayOf("Ali", "Vali", "Hasan", "Husan")

    override fun getIterator(): Iterator<String> {
        return NameIterator()
    }

    // Iterator implementatsiyasi
    private inner class NameIterator : Iterator<String> {
        var index = 0

        override fun hasNext(): Boolean {
            return index < names.size
        }

        override fun next(): String {
            return if (hasNext()) names[index++] else ""
        }
    }

}