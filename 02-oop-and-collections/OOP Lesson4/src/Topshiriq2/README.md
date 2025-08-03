Kotlin OOP - 2-Topshiriq (4-dars)

Bu loyiha Kotlin dasturlash tilida `Abstract`, `Interface`, `Inheritance` va `Encapsulation` tushunchalarini mustahkamlash maqsadida tuzilgan.

## 📚 Nimalarni o‘rgandim?
- `abstract class` va `interface`lar bilan ishlash
- OOP prinsiplarini real hayotiy misolda qo‘llash (Employee & Department)
- JVM Signature clash muammolarini aniqlash va yechish
- Xodimlarni ro‘yxatga olish, lavozim tayinlash va ishdan bo‘shatish tizimini qurish

## 🧩 Loyihadagi interfeyslar:
- `Employable` – ishga olish/bo‘shatish funksiyasi
- `Payable` – maosh bilan ishlash
- `Workable` – ishni bajarish va hisobot
- `PositionAssignable` – lavozim belgilash
- `DeptManageable` – bo‘lim boshqaruvi

## 🏗 Sinflar:
- `Person` – asosiy inson modeli
- `Employee` – ishchi (Person dan voris olgan)
- `Department` – bo‘limlar uchun xodimlarni boshqarish sinfi

## ▶️ Ishga tushirish
```kotlin
fun main(args: Array<String>) {
    // Department va Employee lar bilan ishlash
}
📁 Fayl tuzilmasi:

Topshiriq2/
│
├── Employee.kt
├── Department.kt
├── Person.kt
├── main.kt
└── interfaces (Employable, Payable, etc.)
✍️ Muallif
Bunyodjon Raxmonov