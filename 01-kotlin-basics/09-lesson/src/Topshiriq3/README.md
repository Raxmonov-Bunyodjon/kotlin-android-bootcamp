# 📶 Internet Traffic Checker - Kotlin

Bu Kotlin dastur foydalanuvchining qolgan internet trafigi fayl yuklab olish uchun yetarli yoki yetmasligini aniqlaydi. Trafik yetmasa, foydalanuvchiga ogohlantiruvchi xabar beradi.

## 🔧 Texnologiya
- Kotlin
- IntelliJ IDEA
- Scanner for input
- Exception handling

## 💻 Ishlash tartibi

1. Trafik miqdorini kiritasiz (masalan: `100`)
2. Yuklab olinayotgan fayl hajmini kiritasiz (masalan: `50`)
3. Agar trafik yetarli bo‘lsa:  
   `Fayl muvaffaqiyatli yuklab olindi! Qolgan trafik: 50 MB`
4. Agar yetarli bo‘lmasa:  
   `Xatolik: Internet trafikiz yetarli emas. Sizda faqat 30 MB bor.`

## 📂 Foydalanish
```kotlin
val scanner = Scanner(System.`in`)

// Trafik va fayl hajmini kiritish
val mytrafic = scanner.nextInt()
val netfile = scanner.nextInt()

// Trafik yetarliligini tekshirish
if (mytrafic - netfile < 0) {
    throw Exception("Internet trafikiz yetarli emas.")
} else {
    println("Fayl yuklab olindi!")
}
📬 Muallif
Ism: Raxmonov Bunyodjon

Telegram: @RaxmonovBunyodjon