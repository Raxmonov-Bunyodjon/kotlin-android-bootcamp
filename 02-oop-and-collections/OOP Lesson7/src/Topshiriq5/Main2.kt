package Topshiriq5

fun main(args: Array<String>) {

    var collection1 = PlayerDataServiceImpl()
    collection1.footballClub("Real Madrid", "Barcelona", "Chelse", "Liverpul", "Mancherter Yunatet")

    var collections2 = PlayerDataServiceImpl()
    collections2.superLigaUFF(1,2,33,33,4,5,6,6,7,8,8)
    //println(collections2)
    collections2.dangerousGamesName(1,2,33,33,4,5,6,6,7,8,8)
    //println(collections2)

    var collections3 = PlayerDataServiceImpl()
    collections3.footballClub(1,1,1,1,1,1,1,1,1,2,2,2,22,2,2,2,2,2,4,4,4,4,4,4,4,5,5,5,5,5)
    collections2.superLigaUFF(1,1,1,1,1,1,1,1,12,2,22,2,2,2,2,2,2,23,3,3,3,3,3,)
    collection1.dangerousGamesName(1,1,1,1,1,1,1,1,1,2,2,2,22,2,2,2,2,2,4,4,4,4,4,4,4,5,5,5,5,5)
}