# 📦 Kotlin OOP: Extension Functions (Topshiriq 4)

Bu loyiha Kotlin dasturlash tilida yozilgan 5 ta **extension function** (kengaytma funksiyalar) ni o'z ichiga oladi. Har bir funksiya Kotlinning oddiy sinflariga qo‘shimcha imkoniyatlar yaratadi.

## 🛠 Extension funksiyalar:

1. `String.reverseWord()` – satr so‘zlarini teskari tartibda chiqaradi.
2. `Int.myPow(n)` – sonning `n` darajasini hisoblaydi.
3. `Int.tubSon()` – tub sonligini aniqlaydi.
4. `Int.returnInString()` – sonni matnga (so‘z bilan) o‘giradi.
5. `Array<Int>.sort()` – massivni kamayish tartibida sort qiladi (custom sort).

## 📂 Loyihaning asosiy fayllari:

- `Main.kt` – funksiyalarni chaqirish va test qilish.
- `ExtensionFunctions.kt` – extension functionlar.

## 🚀 Ishga tushirish

```bash
kotlinc Main.kt -include-runtime -d main.jar
java -jar main.jar
📋 Namuna natija:

PDP in online development Android
27
false
ikki milliard yuz o'n to'qqiz million ming yuz ellik
[9, 8, 6, 6, 5]