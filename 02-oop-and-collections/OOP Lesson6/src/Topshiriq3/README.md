# 🎮 Kotlin OOP: Object vs Companion Object

Ushbu loyihada `object` va `companion object` o‘rtasidagi farqlarni amaliy tarzda o‘rgandim.

## 📁 Loyihaning tuzilishi

### 📌 Games class
- `gameName`, `gamingDeviceName`, `productedYear`, `sizeGame` kabi fieldlar
- `showInfo()` funksiyasi o‘yinning asosiy ma’lumotlarini chiqaradi

### 🧭 Companion Object
- `getInfo()` — default o‘yin yaratadi
- `setInfo(...)` — parametrlar orqali yangi o‘yin yaratadi

### 🔧 Object: Setub
- Singleton obyekt: faqat bitta holatda ishlaydi
- O‘yin o‘rnatish sozlamalari:
    - `setInfo(...)`
    - `showInfo()`
    - `clear()`

## 📌 Asosiy farqlar
| Companion Object | Object (Singleton) |
|------------------|---------------------|
| Bir nechta obyekt olish mumkin | Faqat bitta holatda ishlaydi |
| Klass ichidagi static funksiyalar | Klass ichidagi mustaqil singleton |
| Class orqali chaqiriladi | Bevosita nomi orqali chaqiriladi |

## ▶️ Ishlatish
```kotlin
val game1 = Games.getInfo()
val game2 = Games.setInfo("Pes", "PS7", 2025, 3000000.0)

Games.Setub.setInfo("FIFA", 200000.0, 32)
Games.Setub.showInfo()
🛠 Texnologiyalar
Kotlin

Object-Oriented Programming (OOP)