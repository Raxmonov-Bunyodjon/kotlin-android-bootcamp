package StructuralPatterns6

// Context - Tree
class Tree(private val x: Int, private val y: Int, private val type: TreeType) {

    fun draw() {
        type.draw(x, y)
    }
}