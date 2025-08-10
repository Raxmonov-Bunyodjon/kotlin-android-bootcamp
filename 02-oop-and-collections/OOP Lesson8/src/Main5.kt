fun main(args: Array<String>) {

    var list = ArrayList<String>()

    list.add("Nexia")
    list.add("Captiva")
    list.add("Gentra")
    list.add("Cobalt")
    for (s in list) {
        println(s)
    }

    list.remove("Gentra")
    for (s in list) {
        println(s)
    }
}