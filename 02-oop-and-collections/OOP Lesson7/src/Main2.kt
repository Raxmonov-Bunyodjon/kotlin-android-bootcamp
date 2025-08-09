fun main(args: Array<String>) {

    var a = ServiceImpl(10)

    var b = TwoService(a)
    b.display()

    val c: String by lazy {
        "FIFA GAME"
    }

    println(c)
}