fun main(args: Array<String>) {
    //key ->Kalit
    //value -> Qiymat

    var a = mapOf<Int,String>(1 to "Bir", 2 to "Ikki", 3 to "Uch")

    println(a)
    var b = mapOf<Int, String>()
    println(b)

    println(a.keys)
    println(a.values)

    println(a.size)
    println(a.count())
}