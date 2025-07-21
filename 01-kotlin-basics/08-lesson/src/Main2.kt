import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var a = IntArray(4)

    for (item in a.indices){
        a[item] = scanner.nextInt()
    }


    for (item in a){
        println(item)
    }
}