import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var m =scanner.nextInt()
    var a = DoubleArray(m)

    for (item in a.indices){
        a[item] = scanner.nextDouble()
    }

    for (item in a.indices){
        println(a[item])
    }
}