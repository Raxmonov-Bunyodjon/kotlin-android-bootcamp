fun main(args: Array<String>) {

    var a = listOf<String>("Kotlin", "Java","Android")

    println(a[0])

    println(a.indexOf("Java"))

    println(a.size)

    for (i in a.indices) {
        println(a[i])
    }

    println(a.lastIndex)
    println(a.first())
    println(a.last())
}