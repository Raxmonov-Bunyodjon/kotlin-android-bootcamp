fun main(args: Array<String>) {

    try {
        var a = IntArray(5)
        a[5] = 10 / 2
    }catch (e: Exception){
        e.printStackTrace()
    }
}