package BehavioralPatterns6

// Originator - matn muharriri
class TextEditor {
    private var text: String = ""

    fun write(newText: String) {
        text += newText
    }

    fun getText(): String {
        return text
    }

    // Hozirgi holatni saqlash
    fun save(): TextMemento {
        return TextMemento(text)
    }

    // Saqlangan holatni tiklash
    fun restore(memento: TextMemento) {
        text = memento.text
    }
}