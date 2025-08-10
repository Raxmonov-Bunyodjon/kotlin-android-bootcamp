fun main(args: Array<String>) {

    var a = ArrayList<String>()

    var b = ArrayList<String>()

    a.add("Kotlin")
    a.add("Java")

    b.add("Python")
    b.add("JavaScript")


    a.addAll(b)

    println(a)
}