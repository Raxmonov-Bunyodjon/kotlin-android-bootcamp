fun main(args: Array<String>) {

    var a:Any = "Kotlin"
    var b: String? = a as String
    var c:Int? = a as? Int
    println(b)
    println(c)
}