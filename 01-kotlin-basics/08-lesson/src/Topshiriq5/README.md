# 🧮 Topshiriq-5: Matritsa yaratish va qiymatlar bilan to‘ldirish

## 📄 Tavsif

Ushbu dastur foydalanuvchidan matritsaning o‘lchamlarini (qatorlar soni `m` va ustunlar soni `n`) kiritishni so‘raydi. So‘ngra `m x n` o‘lchamli matritsa yaratilib, har bir element qator indeksiga qarab `10 * row` ko‘rinishida qiymatlar bilan to‘ldiriladi.

## ✅ Masalan

Agar foydalanuvchi quyidagi sonlarni kiritsa:

Qatorlar soni (m): 3
Ustunlar soni (n): 4



U holda chiqish quyidagicha bo‘ladi:

Natija matritsa:
0 0 0 0
10 10 10 10
20 20 20 20

kotlin


## 🧠 Asosiy tushunchalar

- `Scanner` yordamida foydalanuvchidan qiymat olish
- 2 o‘lchovli massiv (matritsa) yaratish
- `for` sikli orqali matritsani to‘ldirish va chiqarish

## 💡 Dastur kodi

```kotlin
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
👨‍💻 Muallif
GitHub: @Raxmonov-Bunyodjon


