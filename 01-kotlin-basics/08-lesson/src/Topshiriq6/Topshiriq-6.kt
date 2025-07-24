import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Birinchi butun sonni matritsaning qatorlar uchun kiriting: ")
    var m = scanner.nextInt()
    println("Ikkinchi butun sonni matritsaning ustunlari uchun kiriting: ")
    var n = scanner.nextInt()

    println("$m ta butun son kiriting: ")
    val arr = IntArray(m)
    for (i in 0 until m) {
        arr[i] = scanner.nextInt()
    }

    val matrix = Array(m) { IntArray(n) }
    for (i in 0 until m) {
        for (j in 0 until n) {
            matrix[i][j] = arr[i]
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