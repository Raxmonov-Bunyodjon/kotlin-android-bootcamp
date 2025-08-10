fun main(args: Array<String>) {

    var list = ArrayList<String>()

    list.add("Bunyodjon")
    list.add("Jalol")
    list.add("Doston")
    list.add("Akbar")
    for (s in list) {
        println(s)
    }
    list[2] = "Dilmurod"
    for (s in list) {
        println(s)
    }
}