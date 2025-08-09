# 📌 3 ta son ichidan eng kattasini aniqlovchi Generic funksiya

Bu loyiha Kotlin dasturlash tilida **Generic Function** yordamida 3 ta son ichidan eng kattasini aniqlashni ko‘rsatadi.

## 📂 Kod haqida

```kotlin
fun <T: Comparable<T>> findBigNumber(number1: T, number2: T, number3: T): T? {
    when {
        number1 > number2 && number1 > number3 -> return number1
        number1 == number2 && number1 > number3 -> return number1
        number1 == number3 && number1 > number2 -> return number1
        number2 > number1 && number2 > number3 -> return number2
        number2 == number1 && number2 > number3 -> return number2
        number2 == number3 && number2 > number1 -> return number2
        number3 > number2 && number3 > number1 -> return number3
        number3 == number1 && number3 > number2 -> return number3
        number3 == number2 && number3 > number1 -> return number3
        else -> println("Barcha sonlar teng!")
    }
    return null
}
🔹 Ishlash printsipi
Funksiya Generics va Comparable interfeysidan foydalanadi.

3 ta parametr oladi (number1, number2, number3).

Har birini taqqoslab eng kattasini qaytaradi.

Agar barchasi teng bo‘lsa, null qaytaradi.

▶ Ishga tushirish

kotlinc Main.kt -include-runtime -d app.jar
java -jar app.jar
📷 Namuna chiqish

Input: 22.0, 11.0, 222.0
Output: 222.0
✍ Muallif: Bunyodjon