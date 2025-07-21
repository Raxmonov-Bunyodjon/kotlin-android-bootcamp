fun main(args: Array<String>) {

    var a = arrayOf<Int>(16,21,35,50)

//    a[1] = 88
//    println(a[1])

    var b = arrayOf<String>("Kotlin","Python","Java","Android")

//    println(b.contains("Python"))
//    println(b.size)

    println(b.first())
    println(b.last())

    val index = b.indexOf("Android")
    println(index)
}