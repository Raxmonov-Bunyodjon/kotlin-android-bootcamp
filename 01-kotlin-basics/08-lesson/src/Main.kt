fun main(args: Array<String>) {
    var a = arrayOf("FIFA", 22, 56.55, '#', true)

    for (item in a.indices){
        println(a[item])
    }

    println("@@@@@@@@@@@@@@@@@")
    for (i in a){
        println(i)
    }
}