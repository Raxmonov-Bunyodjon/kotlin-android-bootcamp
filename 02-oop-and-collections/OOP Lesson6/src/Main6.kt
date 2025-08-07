fun main(args: Array<String>) {

    var a = "FIFA Online"

    println(a.middleTwoChar())
}

fun String.middleTwoChar(): String {
    return this.substring(this.length/2-1, this.length/2+1)
}