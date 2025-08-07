# 🚖 Yandex Taksi (Kotlin konsol ilovasi)

Bu loyiha Kotlin dasturlash tilida yozilgan Yandex Taksi ilovasining konsol versiyasi bo‘lib, foydalanuvchi haydovchi yoki yo‘lovchi sifatida tizimga kirib, taksi chaqirish va safarni boshqarish imkonini beradi.

## ✨ Asosiy imkoniyatlar

- `sealed class User` orqali **haydovchi** va **yo‘lovchi** rollari ajratilgan
- `RideManager` yordamida safar yaratiladi va boshqariladi
- `RideLogger` – barcha safarlarni log qilish
- `RideStatusHelper` – safar holatini aniqlash
- `enum class RideStatus` – safarning bosqichma-bosqich holatlari

## 🧱 Texnologiyalar

- Kotlin (OOP: `sealed`, `enum`, `inner class`, `data class`)
- Konsol interfeysi

## 🛠 OOP elementlari

- `sealed class` → rollar (`Passenger`, `Driver`)
- `data class` → `Ride`, `Passenger`, `Driver`
- `enum class` → `RideStatus`
- `inner class` → `RideLogger`
- `nested class` → `RideStatusHelper`

## 📦 Loyiha tuzilmasi

Topshiriq8/
├── User.kt // sealed class: Passenger & Driver
├── Ride.kt // data class: Ride + funksiyalar
├── RideManager.kt // RideManager, RideLogger, RideStatusHelper
├── RideStatus.kt // enum class: RideStatus
└── Main.kt // asosiy ishchi fayl



## ▶️ Ishga tushirish

```bash
kotlinc Main.kt -include-runtime -d main.jar
java -jar main.jar
Yoki IDE orqali main() funksiyasini ishga tushiring.