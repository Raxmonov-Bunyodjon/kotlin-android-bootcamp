package BehavioralPatterns6

fun main(args: Array<String>) {

    val editor = TextEditor()
    val history = History()

    editor.write("Salom, ")
    history.push(editor.save()) // Saqlash

    editor.write("dunyo!")
    history.push(editor.save()) // Saqlash

    println("Hozirgi matn: ${editor.getText()}") // Salom, dunyo!

    // Oxirgi holatga qaytish (Undo)
    editor.restore(history.pop()!!)
    println("Undo qilingandan keyin: ${editor.getText()}") // Salom, dunyo!

    // Yana bir marta orqaga qaytish
    editor.restore(history.pop()!!)
    println("Yana Undo: ${editor.getText()}") // Salom,
}