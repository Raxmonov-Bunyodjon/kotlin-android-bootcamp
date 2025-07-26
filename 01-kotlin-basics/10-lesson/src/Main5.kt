fun main(args: Array<String>) {

    var a: String? = null
    var b: String? = "Kotlin"
    var aLen = if (a != null) a.length else -1
    var bLen = if (b != null) b.length else -1

    var a1 = a?.length ?: -1
    var b1 = b?.length ?: -1
    println(a1)
    println(b1)

//    println(aLen)
//    println(bLen)
}