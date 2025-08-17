package BehavioralPatterns4

fun main(args: Array<String>) {

    val nameRepository = NameRepository()
    val iterator = nameRepository.getIterator()

    while (iterator.hasNext()) {
        println("Name: ${iterator.next()}")
    }
}