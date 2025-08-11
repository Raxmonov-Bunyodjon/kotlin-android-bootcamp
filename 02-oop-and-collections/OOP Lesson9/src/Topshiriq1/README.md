# Topshiriq 1 - Kotlin SetOf Stream Loyihasi

Bu loyiha Kotlin dasturlash tilida `setOf` funksiyasi yordamida yaratilgan. Loyihada ikkita to‘plam ishlatilgan: biri faqat string ismlar, ikkinchisi aralash turdagi qiymatlar (`Int`, `String`). OBS Studio orqali stream formatda yozilgan.

## 📌 Loyihada ishlatilgan texnologiyalar
- Kotlin
- OBS Studio (stream formatda yozilgan)
- GitHub (versiya nazorati)
- Telegram (post tarqatish)

## 🎬 YouTube Stream
Loyihaning to‘liq stream videosi OBS orqali yozilgan. OBS sozlamalari haqida ko‘proq bilmoqchi bo‘lsangiz:
- [OBS Studio Full Setup Guide and Tutorial For Streaming](https://www.youtube.com/watch?v=9idPREZzWpE) — OBS’ni to‘liq sozlash bo‘yicha qo‘llanma
- [How to Use OBS Studio - Complete OBS Tutorial for Beginners (2025)](https://www.youtube.com/watch?v=9z9GiEM4uvA&pp=0gcJCfwAo7VqN5tD) — OBS interfeysi, sahnalar, audio va video sozlamalari
- [OBS Studio - BEST Streaming Settings for YouTube 2025!](https://www.youtube.com/watch?v=fhlniJVXFIo) — YouTube uchun eng yaxshi stream sozlamalari

## 📂 Foydalanish
```kotlin
fun main(args: Array<String>) {
    val club1 = setOf("Bunyodjon", "Murodjon", "Dilmurod", "Asilbek", "Diyorbek")
    val club2 = club1.sorted()

    val number1 = setOf<Any>(10, "Messi", 7, "Ronaldo", 17, "Nani")
    val number2 = number1

    for (s in number2) println(s)
    for (s in club2) println(s)
}
📣 Muallif
Loyiha muallifi: [Ismingizni kiriting]