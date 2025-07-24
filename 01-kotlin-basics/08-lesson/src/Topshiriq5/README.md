# 📌 Topshiriq-5: Matrix Generation in Kotlin


## 📋 Task Description

👉 `m` va `n` butun musbat sonlar berilgan. `m x n` o‘lchamli matritsani shunday hosil qilingki, uning **har bir i-satri elementlari `10 * i` ga teng** bo‘lsin.  
`i = 0, 1, 2, ..., m - 1`

### 🔢 Misol:

Agar foydalanuvchi `m = 3` va `n = 4` deb kiritsa, chiqish quyidagicha bo‘ladi:

Natija matritsa:
0 0 0 0
10 10 10 10
20 20 20 20

kotlin
Copy
Edit

## 💡 Solution Overview

Ushbu dastur quyidagi bosqichlarda ishlaydi:
1. Foydalanuvchidan matritsa o‘lchamlari (`m` va `n`) so‘raladi.
2. Har bir `i`-satr uchun `10 * i` qiymatlari bilan to‘ldirilgan `IntArray` yaratiladi.
3. Matritsa ekranga chiroyli tarzda chiqariladi.

## 📎 Source Code

```kotlin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Birinchi butun sonni matritsaning qatorlar uchun kiriting: ")
    val m = scanner.nextInt()
    println("Ikkinchi butun sonni matritsaning ustunlari uchun kiriting: ")
    val n = scanner.nextInt()

    val matrix = Array(m) { row -> IntArray(n) { 10 * row } }

    println("Natija matritsa:")
    for (i in 0 until m) {
        for (j in 0 until n) {
            print("${matrix[i][j]}\t")
        }
        println()
    }
}
📂 File Structure
css
Copy
Edit
/05-lesson/
├── Task5/
│   ├── Main.kt
│   └── README.md
🔗 Links
🧑‍💻 My GitHub Profile: @Raxmonov-Bunyodjon

📘 Repository: kotlin-android-bootcamp