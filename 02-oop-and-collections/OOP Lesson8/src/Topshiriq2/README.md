# Konsol Payme (Kotlin)

Ushbu loyiha **Kotlin** tilida yozilgan konsol dastur bo‘lib, `Payme` mobil ilovasining soddalashtirilgan versiyasini taqdim etadi.  
Funktsiyalar quyidagilarni o‘z ichiga oladi:

- 💳 **Karta qo‘shish**
- 💸 **Kartadan kartaga pul o‘tkazish**
- 🔄 **Pulni qaytarib olish (refund)**
- 📊 **Monitoring (hisobot)**

---

## 📂 Loyihaning tuzilishi

Topshiriq2/
├── Card.kt # Karta modeli
├── Transaction.kt # Tranzaksiya modeli
├── CardService.kt # Asosiy interfeys
├── CardServiceImpl.kt # Interfeys implementatsiyasi
└── Main.kt # Dastur ishga tushirish nuqtasi



---

## 🚀 Ishga tushirish

1. Loyihani klonlash:
   ```bash
   git clone https://github.com/<username>/konsol-payme.git
   cd konsol-payme
Kotlin bilan ishga tushirish:


kotlinc Topshiriq2/*.kt -include-runtime -d payme.jar
java -jar payme.jar
💻 Ishlash jarayoni
Karta qo‘shish

Pul o‘tkazish

Hisobot ko‘rish

Refund qilish

Qayta hisobot

📷 Konsol chiqishi namunasi
bash
Copy
Edit
✅ Transfer muvaffaqiyatli!
📜 Tranzaksiyalar ro‘yxati:
Transaction(id=1, fromCard=8600123456789012, toCard=9860123456789012, amount=200.0, date=2025-08-09T16:20:45.512, status=SUCCESS)
✅ Pul qaytarildi!
📜 Tranzaksiyalar ro‘yxati:
Transaction(id=1, fromCard=8600123456789012, toCard=9860123456789012, amount=200.0, date=2025-08-09T16:20:45.512, status=REFUNDED)
🛠 Texnologiyalar
Kotlin

OOP

Data classes

Collections

Interfaces

Console I/O

📜 Litsenziya
Ushbu loyiha MIT License asosida tarqatiladi.