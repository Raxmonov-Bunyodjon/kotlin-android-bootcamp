fun main(args: Array<String>) {

    var outer = Outer2()
    println(outer.a)

    val inner = outer.Inner()
    println(inner.display())

    Outer2().Inner()
}