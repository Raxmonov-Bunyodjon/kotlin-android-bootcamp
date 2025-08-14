fun main(args: Array<String>) {

    var map = HashMap<Int, String>(3)

    map[1] = "Kotlin"
    map[2] = "Java"
    map[3] = "Android"
    println(map.size)
    map[4] = "Python"
    println(map.size)
//    for (entry in map) {
//        println("${entry.key}  ${entry.value}")
//    }

    for (key in map.keys) {
        println("$key ${map[key]}")
    }


}