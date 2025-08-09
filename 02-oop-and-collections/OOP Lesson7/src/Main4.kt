fun main(args: Array<String>) {

//    var a = listOf<String>("Kotlin","Java", "Android")    //immutuble colletions
//
//    for (s in a){
//        println(s)
//    }

    var b = mutableListOf<String>("Personal", "Develoment","Process")

    for (s in b) {
        println(s)
    }

    b[0] = "Bunyod"

    for (s in b) {
        println(s)
    }



}