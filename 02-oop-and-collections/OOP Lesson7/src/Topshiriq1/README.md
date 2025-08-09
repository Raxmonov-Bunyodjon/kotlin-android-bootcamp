# GenericUser — Kotlin Generic Class misoli

Bu loyiha Kotlin’da **Generic Class** ishlash prinsipini amaliy ko‘rsatadi.  
Foydalanuvchi haqidagi ma’lumotlarni (`name`, `age`, `gender`, `birthday`, `country`) **turli tiplar** bilan saqlash va chiqarish imkonini beradi.

---

## 📌 Kod

```kotlin
package Topshiriq1

class GenericUser<N, A, G, B, C>(
    val name: N,
    val age: A,
    val gender: G,
    val birthday: B,
    val country: C
) {
    fun AboutMe() {
        println("Ismim: $name,\nYoshim: $age,\nJinsim: $gender\nTug'ilgan kunim: $birthday\nMamlakatim: $country")
    }
}
🚀 Ishga tushirish

# Kotlin faylini kompilyatsiya qilish
kotlinc Main.kt -include-runtime -d app.jar

# Ishga tushirish
java -jar app.jar
🧠 O‘rganilgan mavzular
Generic Class yaratish

Har xil tipdagi ma’lumotlarni qabul qilish

Metod ichida generic property’lardan foydalanish

Bir nechta tip parametrlari (<N, A, G, B, C>)

✨ Natija


Ismim: Bunyod,
Yoshim: 26,
Jinsim: Mane
Tug'ilgan kunim: 5-08-1999
Mamlakatim: Uzbekistan