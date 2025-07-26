fun main(args: Array<String>) {

    var a: String? = "Kotlin"

    var len = if (a != null) a.length else -1
    println(len)
    a = null

    len = if (a != null) a.length else -1
    println(len)
}