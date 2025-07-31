# OOP - 2-modul, 3-dars: `Circle` va `Cylinder` sinflari

## 📌 Vazifa mazmuni

Bu topshiriqda OOP (Obyektga yo‘naltirilgan dasturlash) konseptlari asosida quyidagilar bajarildi:

- `Circle` – asosiy (`superclass`) klass yaratildi:
    - `radius` va `color` xususiyatlari
    - `getRadius()`, `getColor()`, `getArea()`, `toString()` metodlari
- `Cylinder` – `Circle` klassidan voris oluvchi (`subclass`) klass yaratildi:
    - `height` xususiyati qo‘shildi
    - `getVolume()`, `toString()` metodlari override qilindi
- Maqsad: Vorislik, `override`, `constructor`, va `getter/setter` ishlashini amaliyotda qo‘llash

## 💡 O‘rganilgan asosiy tushunchalar:

- `Inheritance` (Vorislik)
- `Override` va `toString()` ni qayta aniqlash
- Konstruktorlar bilan ishlash (Primary va Secondary)
- Kapsulyatsiya orqali ma'lumotlarni boshqarish

## 🔢 Natija

Konsolda obyektlar eski va yangi qiymatlari, yuzasi, hajmi va to‘liq obyekt ko‘rinishlari chiqariladi.

## 📂 Fayllar:

- `Circle.kt` – Superclass
- `Cylinder.kt` – Subclass
- `Main.kt` – Asosiy ishchi fayl

## 🧪 Ishga tushirish:
```bash
kotlinc Circle.kt Cylinder.kt Main.kt -include-runtime -d OOP3.jar
java -jar OOP3.jar