package StructuralPatterns6

// Flyweight Factory
object TreeFactory {

    private val treeTypes = mutableMapOf<String, TreeType>()

    fun getTreeType(name: String, color: String, texture: String): TreeType {
        val key = "$name-$color-$texture"
        return treeTypes.getOrPut(key) {
            println("✅ Yangi TreeType yaratildi: $key")
            TreeType(name, color, texture)
        }
    }
}