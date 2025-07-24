import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    println("Birinchi butun sonni matritsaning qatorlar uchun kiriting: ")
    var m = scanner.nextInt()
    println("Ikkinchi butun sonni matritsaning ustunlari uchun kiriting: ")
    var n = scanner.nextInt()

    var matrix = Array(m) { row -> IntArray(n) { 10 * row } }

    println("Natija matritsa:")
    for (i in 0 until m) {
        for (j in 0 until n) {
            print("${matrix[i][j]}\t")
        }
        println()
    }
}