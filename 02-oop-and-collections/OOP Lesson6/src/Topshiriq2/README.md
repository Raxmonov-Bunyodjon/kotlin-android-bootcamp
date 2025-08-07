👨‍🏫 Kotlin OOP – Teacher Project (Using Companion Object)

Bu kichik Kotlin loyihasida `companion object` orqali obyekt yaratish va boshqarish amaliyoti bajarilgan.

## 🧾 Tavsif

- `Teacher` — `data class` bo‘lib, quyidagi xususiyatlarga ega:
    - `name`: o‘qituvchining ismi
    - `science`: o‘qitadigan fani
    - `gender`: jinsi
    - `experienceYear`: tajribasi

## 📦 Companion Object

### 🧩 Funksiyalar:
- `getInfo()` – default o‘qituvchi obyektini yaratadi
- `setInfo(name, science, gender, experienceYear)` – parametrlar asosida yangi o‘qituvchi obyektini yaratadi

## 🔍 Qo‘shimcha method
- `showInfo()` – obyekt haqidagi ma’lumotlarni konsolga chiqaradi

## 📂 Misol

```kotlin
val teacher1 = Teacher.getInfo()
val teacher2 = Teacher.setInfo("Jasur", "Fizika", "Erkak", 5)

teacher1.showInfo()
teacher2.showInfo()
📚 O‘rgangan narsalar:
companion object yordamida obyektni boshqarish

Klassga tegishli metodlar yozish

