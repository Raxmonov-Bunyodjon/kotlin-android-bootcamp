package Topshiriq5

class PlayerDataServiceImpl: PlayerDataService {

    override fun <T> footballClub(vararg a: T) {
        val aList: List<T> = a.toList()
        println(aList)
    }

    override fun <T> superLigaUFF(vararg b: T) {
        val bMutableList: MutableList<T> = b.toMutableList()
        println(bMutableList)
    }

    override fun <T> dangerousGamesName(vararg c: T) {
        val cMutableSet: MutableSet<T> = c.toMutableSet()
        println(cMutableSet)
    }
}