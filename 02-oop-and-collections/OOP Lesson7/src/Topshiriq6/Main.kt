package Topshiriq6

fun main() {
    // ReadWriteList sinovi
    val rwList = ReadWriteList<String>()
    rwList.add("Real Madrid")
    rwList.add("Barcelona")
    rwList.add("PSG")
    println("Barcha elementlar: ${rwList.getAll()}")
    println("Birinchi 'B' bilan boshlanadigan: ${rwList.findFirst { it.startsWith("B") }}")
    println("B bilan boshlanadiganlar: ${rwList.findAll { it.startsWith("B") }?.getAll()}")

    // ReadOnlyList sinovi
    val roList = ReadOnlyList(listOf("Bayern", "Chelsea", "Juventus"))
    println("ReadOnly barcha: ${roList.getAll()}")
    println("J bilan boshlanadiganlar: ${roList.findAll { it.startsWith("J") }.getAll()}")

    // WriteOnlyList sinovi
    val woList = WriteOnlyList<Int>()
    woList.add(10)
    woList.add(1, 20)
    woList.addAll(30, 40, 50)
    println("WriteOnly ichidagi ma'lumot (test uchun): ${woList.getHidden()}")
}