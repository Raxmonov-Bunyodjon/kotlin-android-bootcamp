fun main(args: Array<String>) {

    var map = mapOf(1 to "Kotlin", 2 to "Java", 3 to "Android")

    println(map[2])

    println(map.getOrDefault(4, "Python"))

    println(map.getOrElse(4, { "FIFA" }))
}