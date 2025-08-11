fun main(args: Array<String>) {

    val a = setOf("Java", "Kotlin", 10, 19.5, 11)

    println(a.contains(19.5))

    println(a.containsAll(setOf("Java", 10)))
}