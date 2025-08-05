# 🚗 Kotlin OOP - Nested va Inner Class (2-Modul 5-Dars)

## 📌 Topshiriq:
**"Inner class yaratib, undan obyekt oling"**

## ✅ Yechim:
- `Car` nomli tashqi class yaratildi. U mashina haqida ma'lumotlarni saqlaydi.
- `Carmarket` nomli **inner class** yaratilgan bo‘lib, u avtomobilni sotish jarayonini ifodalaydi.
- `identifyAge()` funksiyasi yordamida mashinaning yoshi hisoblab beriladi.
- `formalizationProcess()` funksiyasi avtomobil savdosining barcha tafsilotlarini chiqaradi.

## 🛠 Kod qisqacha:
```kotlin
val car = Car(...).Carmarket("Seller", "Buyer", 10000.0)
println(car.formalizationProcess())
📌 O‘rganganlarim:
Inner class nima va undan qanday obyekt olinadi.

Tashqi class funksiyasini inner classda qanday chaqirish mumkin.

Amaliy avtomobil savdo jarayonini OOP orqali modellashtirish.

📁 Fayllar:

Car.kt

Main.kt