# Kotlin Object - Relationship Project 👥

Bu kichik Kotlin loyihasi orqali `object` (singleton) mavzusini mustahkamlash maqsadida **Relationship** nomli singleton obyekt yaratildi.

## 📌 Loyiha tavsifi:

- `object Relationship` — bitta foydalanuvchi haqida ma'lumot saqlaydi.
- Holat (state): `name`, `gender`, `age`
- Usullar:
    - `setUser()` – foydalanuvchi ma'lumotini belgilaydi
    - `showInfo()` – konsolga chiqaradi
    - `clear()` – ma'lumotlarni tozalaydi
    - `toString()` – obyekt holatini chiqaradi

## 🧪 Ishlash namunasi:

```kotlin
Relationship.setUser("Bunyod", "Erkak", 22)
Relationship.showInfo()
println(Relationship)
Relationship.clear()
Relationship.showInfo()
🧠 O‘rganilgan konseptlar:
object (singleton)

Obyekt holati (state) saqlash

Encapsulation (ma'lumotni yashirish)

✅ Natija:
Bu loyiha orqali object qanday ishlashini amalda ko‘rdik va tushundik.

📁 Papka: Topshiriq1

Topshiriq1/
├── Relationship.kt
└── Main.kt