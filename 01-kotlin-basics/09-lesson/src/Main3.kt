fun main(args: Array<String>) {

    try {
        println(10/0)
    }catch (e: ArithmeticException){
        e.printStackTrace()
    } finally {
        println("Finally")
    }
}