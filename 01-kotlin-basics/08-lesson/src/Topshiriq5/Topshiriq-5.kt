import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    println("Birinchi butun sonni matritsaning qatorlar uchun kiriting: ")
    var m = scanner.nextInt()
    println("Ikkinchi butun sonni matritsaning ustunlari uchun kiriting: ")
    var n = scanner.nextInt()

    val matrix = Array(m) { IntArray(n) }

    for (i in 0 until m) {
        for (j in 0 until n) {
            matrix[i][j] = 10 * i
        }
    }

    println("Natija matritsa:")
    for (i in 0 until m) {
        for (j in 0 until n) {
            print("${matrix[i][j]}\t")
        }
        println()
    }
}