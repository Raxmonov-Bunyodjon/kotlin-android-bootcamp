fun main(args: Array<String>) {

    var a = setOf<String>("FIFA", "Pes", "Football")

    println(a.elementAt(2))

    println(a.indexOf("FIFA"))

    println(a.lastIndexOf("Pes"))

    println(a.first())
    println(a.last())
}