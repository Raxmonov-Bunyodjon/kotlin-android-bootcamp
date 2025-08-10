fun main(args: Array<String>) {

    var list = listOf<Int>(5,9,18,3,7)

    val sortList = list.sorted()
    for (i in sortList) {
        println(i)
    }

    val sortList2 = list.sortedDescending()
    for (i in sortList2) {
        println(i)
    }
}