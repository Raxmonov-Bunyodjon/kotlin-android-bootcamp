package StructuralPatterns3

// 3. Composite (papka)
class Directory(private val name: String) : FileSystemComponent {

    private val children = mutableListOf<FileSystemComponent>()

    fun add(component: FileSystemComponent) {
        children.add(component)
    }

    override fun showDetails(indent: String) {
        println("$indent📂 $name")
        for (child in children) {
            child.showDetails(indent + "   ")
        }
    }
}