fun main(args: Array<String>) {

    var a = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
    var b = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))

    var c = Array(3) { IntArray(3) }

    //[][]
    // 1 2 3
    // 4 5 6
    // 7 8 9

    for (item1 in a.indices) {
        for (item2 in a.indices) {
            c[item1][item2] = a[item1][item2] + b[item1][item2]
        }
    }
    println(c.contentDeepToString())


//    for (item1 in c.indices) {
//        for (item2 in c.indices) {
//            print("${c[item1][item2]} ")
//        }
//        println()
//    }

}