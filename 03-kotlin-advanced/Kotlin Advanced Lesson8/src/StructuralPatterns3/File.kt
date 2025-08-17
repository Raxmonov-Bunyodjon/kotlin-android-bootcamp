package StructuralPatterns3

// 2. Leaf (fayl)
class File(private val name: String): FileSystemComponent{
    override fun showDetails(indent: String) {
        println("$indent📄 $name")
    }
}