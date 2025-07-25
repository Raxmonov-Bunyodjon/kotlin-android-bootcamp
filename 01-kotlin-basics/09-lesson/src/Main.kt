fun main(args: Array<String>) {

    try {
        println(20 / 0)
    } catch (e: ArithmeticException) {
        e.printStackTrace()
    }
    println("Kotlin")

    println(getNumber("10.5"))
}


fun getNumber(a: String):Int{
    return try {
        Integer.parseInt(a)
    }catch (e: NumberFormatException){
        0
    }
}