package BehavioralPatterns6

// Caretaker - tarixni boshqaradi
class History {

    private val history = mutableListOf<TextMemento>()

    fun push(memento: TextMemento) {
        history.add(memento)
    }

    fun pop(): TextMemento? {
        if (history.isNotEmpty()) {
            val last = history.removeAt(history.size - 1)
            return last
        }
        return null
    }
}