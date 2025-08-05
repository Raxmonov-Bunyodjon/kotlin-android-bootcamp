fun main(args: Array<String>) {

    var  outer = Outer()

    println(outer.a)

    var nested = Outer.Nested()

    println(nested.b)
    println(nested.show())




}