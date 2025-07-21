fun main(args: Array<String>) {

    var a = CharArray(11)
    var b = BooleanArray(11)
    var d = DoubleArray(11)
    var g = IntArray(11)

    println(a.contentToString()) // ' '
    println(b.contentToString()) //false
    println(d.contentToString()) // 0.0
    println(g.contentToString()) // 0

    var c = arrayOfNulls<String>(7) // null
    println(c.contentToString())
}