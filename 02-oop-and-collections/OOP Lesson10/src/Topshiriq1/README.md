# 🗂 Foydalanuvchilarni Ro'yxatga Olish Tizimi — Kotlin Map

📌 **Loyiha tavsifi:**  
Bu loyiha `MutableMap` kolleksiyasidan foydalanib foydalanuvchilarni ro‘yxatga olish, qidirish va o‘chirish tizimini yaratadi.  
Har bir foydalanuvchi **unikal ID** orqali saqlanadi.

---

## 📚 Texnologiyalar
- Kotlin
- MutableMap
- OOP

---

## ⚙️ Funksiyalar
✅ Foydalanuvchi qo‘shish  
✅ ID orqali foydalanuvchini qidirish  
✅ Foydalanuvchini o‘chirish  
✅ Ro‘yxatni qayta chiqarish

---

## 📜 Kod namunasi
```kotlin
var personsMap: MutableMap<Int, UserRegistration> = mutableMapOf()

var person1 = UserRegistration(1, "Bunyodjon", 26, "Erkak", 112232, "Uzbeksiton")
var person2 = UserRegistration(2, "Jalol", 26, "Erkak", 112232, "Uzbeksiton")

personsMap[person1.id] = person1
personsMap[person2.id] = person2

println("Foydalanuvchilar ro'yxati!")
for ((id,person) in personsMap) {
    println("ID: $id -> Ismi: ${person.name}, Yoshi: ${person.age}  Mamlakati: ${person.country}")
}
📷 Ishlash diagrammasi

+--------+---------------------------+
|   ID   |      UserRegistration     |
+--------+---------------------------+
|   1    |  Bunyodjon, 26, Erkak      |
|   2    |  Jalol, 26, Erkak          |
+--------+---------------------------+