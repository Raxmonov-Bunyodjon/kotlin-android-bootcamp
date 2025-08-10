fun main(args: Array<String>) {

    var list = listOf<Int>(3,9,6,1,0,5)

//    val b  = list.contains(7)
//    if (b){
//        println("Bor")
//    }else{
//        println("Yo'q")
//    }

    val c = list.containsAll(listOf(3, 5))
    if (c){
        println("Bor")
    }else{
        println("Yo'q")
    }
}