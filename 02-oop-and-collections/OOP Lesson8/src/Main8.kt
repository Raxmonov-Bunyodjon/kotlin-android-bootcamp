fun main(args: Array<String>) {

    var list = listOf<String>("Kotlin","Java","Android","JavaScript","Python")

    for (s in list) {
        println(s)
    }

    for (i in 0 until list.size){
        println(list[i])
    }

    println()

    for (i in list.indices){
        println(list[i])
    }

    println()

    list.forEachIndexed {index, s ->
        println(s)
    }
    println()
    var iterator = list.iterator()

    while (iterator.hasNext()) {
        val next = iterator.next()
        println()
    }

}