package StructuralPatterns3

fun main(args: Array<String>) {

    // Fayllar
    val file1 = File("readme.txt")
    val file2 = File("resume.pdf")
    val file3 = File("notes.docx")

    // Ichki papka
    val innerDir = Directory("Documents")
    innerDir.add(file2)
    innerDir.add(file3)

    // Asosiy papka
    val root = Directory("Root")
    root.add(file1)
    root.add(innerDir)

    // Daraxtni chiqarish
    root.showDetails()

}