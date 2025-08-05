fun main(args: Array<String>) {

    var a = Color.Blue()
    chooseClass(a)

}

fun chooseClass(color: Color) {
    when (color) {
        is Color.Red -> println("Qizil")
        is Color.Yellow -> println("Sariq")
        is Color.Blue -> println("Ko'k")
    }
}