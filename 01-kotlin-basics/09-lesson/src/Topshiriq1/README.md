# Prava olish tizimi (Kotlin CLI)

Bu loyiha Kotlin dasturlash tilida yozilgan va foydalanuvchilarga haydovchilik guvohnomasini olish uchun ro'yxatdan o'tish tizimini taqdim etadi. Tizim konsol (CLI) orqali ishlaydi.

## 🧾 Funksiyalar

- ✅ Ro'yxatdan o'tish (faqat 18 yoshdan katta)
- 🔐 Tizimga kirish (username + parol)
- ✏️ Ma'lumotlarni o'zgartirish (parol va username)
- ❌ Foydalanuvchini o'chirish
- 📋 Barcha foydalanuvchilar ro'yxatini ko'rish

## 📌 Talablar

- Foydalanuvchi kamida **18 yoshda** bo'lishi kerak
- Foydalanuvchi quyidagi ma'lumotlarni kiritadi:
    - Username
    - Parol
    - To'liq ism (Familiya, Ism, Sharif)
    - Tug'ilgan yil
    - Passport seriya va raqami

## 💻 Ishlatish

1. `main.kt` faylini Kotlin compiler orqali ishga tushiring:

```bash
kotlinc main.kt -include-runtime -d prava.jar
java -jar prava.jar
Konsolda kerakli amalni tanlang:


1 -> Ro'yxatdan o'tish
2 -> Tizimga kirish
3 -> Ma'lumotlarni o'zgartirish
4 -> Ma'lumotlarni o'chirish
5 -> Barcha foydalanuvchilarni ko'rish
⚠️ Xatoliklar va Exceptionlar
IllegalArgumentException — foydalanuvchi 18 yoshdan kichik bo‘lsa.

InputMismatchException — noto'g'ri ma'lumot (masalan, raqam o'rniga matn) kiritilganda.

👨‍💻 Muallif
Ism: Bunyodjon Raxmonov
