fun main(args: Array<String>) {

    var a = 1..10

    for (item in a step 2){
        println(item)
    }
    for (item in a.reversed()){
        println(item)
    }
}