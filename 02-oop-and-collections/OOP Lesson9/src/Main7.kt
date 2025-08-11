fun main(args: Array<String>) {

    var a = hashSetOf<String>("Personal", "Development", "Process")
    println(a)
    a.add("FIFA")
    println(a)


    var b = setOf<String>("ECMA", "AIF")

    a.addAll(b)

    println(a)

    a.remove("FIFA")

    println(a)

    for (s in a) {
        println(s)
    }
}