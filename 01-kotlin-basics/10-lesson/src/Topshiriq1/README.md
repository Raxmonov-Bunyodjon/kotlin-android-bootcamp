# 🔐 Kotlin User Authentication System (Console Based)

Bu loyiha Kotlin dasturlash tilida yozilgan oddiy `User Registration and Login` tizimidir. Loyihada **Null Safety**, **Scanner**, va **basic conditional logic** ishlatilgan.

## 📌 Asosiy imkoniyatlar

- 👤 Foydalanuvchi qo‘shish (`Register`)
- 🔑 Kirish (`Login`) – email yoki username orqali
- ✏️ Foydalanuvchi ma’lumotlarini o‘zgartirish (parol, username, email)
- 🗑️ Foydalanuvchini o‘chirish
- 🔎 Qidiruv (`username` yoki `email` orqali)
- 📄 Barcha foydalanuvchilar ro‘yxatini ko‘rish
- ❌ Null qiymatlar bilan ishlashda xavfsizlik

## 🛠 Texnologiyalar

- Kotlin
- Scanner (foydalanuvchi kiritmasi uchun)
- Null Safety
- CLI (Command-line interface)

## 🧩 Null Safety ishlatilgan misol

```kotlin
val users = Array<String?>(10) { null }
▶️ Ishga tushurish


kotlinc Main.kt -include-runtime -d main.jar
java -jar main.jar
⚠️ Main.kt nomi siz tanlagan faylga qarab o‘zgaradi.

📁 Loyihada mavjud funksiyalar
Raqam	Amal
1	Ro‘yxatdan o‘tish
2	Tizimga kirish
3	Foydalanuvchi ma’lumotlarini o‘zgartirish (parol, username, email)
4	Foydalanuvchini o‘chirish
5	Username/email orqali qidirish
6	Barcha foydalanuvchilar ro‘yxati

📚 O‘rganilgan mavzular
Kotlin Null Safety

Elvis operator (?:)

Safe va Unsafe casting

Scanner orqali foydalanuvchi kiritmasi

if, when, while, for orqali boshqaruv



👨‍💻 Muallif
Raxmonov Bunyodjon

Telegram: @RaxmonovBunyodjon

Email: bunyodjonraxmonov22@gmail.com