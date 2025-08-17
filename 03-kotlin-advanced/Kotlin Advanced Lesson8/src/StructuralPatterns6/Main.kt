package StructuralPatterns6

fun main(args: Array<String>) {

    val forest = Forest()

    // 1000 ta daraxt ekamiz
    for (i in 1..1000) {
        forest.plantTree(i, i, "Olma", "Yashil", "Yaproqli")
    }

    // Yana boshqa turdagi daraxt
    for (i in 1..500) {
        forest.plantTree(i, i + 2, "Nok", "Sariq", "Silliq")
    }

    // Daraxtlarni chizamiz
    forest.draw()
}