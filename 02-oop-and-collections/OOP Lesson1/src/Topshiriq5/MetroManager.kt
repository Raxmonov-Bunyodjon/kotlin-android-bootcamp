package Topshiriq5


class MetroManager {

    private val metroList = mutableListOf<Metro>()

    fun addMetro(metro: Metro) {
        metroList.add(metro)
    }

    fun filterByTime(maxTime: Int): List<Metro> {
        return metroList.filter { it.travelTime <= maxTime }
    }

    fun printAll(metros: List<Metro>, maxTime: Int) {
        println("Yo‘lda $maxTime daqiqadan kam yoki teng bo‘lgan metro yo‘nalishlari:")
        for (metro in metros) {
            if (metro.travelTime <= maxTime) {
                println(metro)
            }
        }
    }
}