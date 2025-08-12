# 🛒 Mahsulotlarni Ro'yxatga Olish Tizimi

Bu dastur **Kotlin** tilida yozilgan bo‘lib, `Set` kolleksiyasi yordamida mahsulotlarni boshqaradi. Har bir mahsulotning **ID** si unikal bo‘lishi ta’minlanadi (`equals` va `hashCode` qayta yozilgan).

## ✨ Funksiyalar
- ➕ Mahsulot qo‘shish
- ✏️ Mahsulot ma’lumotlarini yangilash
- ❌ Mahsulotni o‘chirish
- 🔍 ID orqali mahsulot qidirish
- 📋 Barcha mahsulotlarni ro‘yxatda ko‘rish

## 📦 Texnologiyalar
- **Kotlin**
- **MutableSet** (takrorlanmas elementlar uchun)
- **OOP** prinsiplari
- **Scanner** orqali foydalanuvchi bilan muloqot

## 📜 Ishlash printsipi
- Mahsulot qo‘shishda `ID` unikal bo‘lishi kerak.
- `equals` va `hashCode` faqat **id** maydoni asosida ishlaydi.
- Takroriy ID kiritilsa, mahsulot qo‘shilmaydi.

## 🚀 Ishga tushirish
1. Loyihani yuklab oling:
   ```bash
   git clone <repo-url>
   cd <project-folder>
main funksiyani ishga tushiring.

📌 Misol ishlash

1. Add product
2. Update product
3. Remove product
4. Find product
5. List all products
0. Exit
   Tanlang: 1
   ID: p1
   Name: Olma
   Price: 12000
   Category: Meva
   Mahsulot qo'shildi!
   bash
   Copy
   Edit
   Tanlang: 5
   Product(id='p1', name='Olma', price=12000.0, category='Meva')
   makefile
   Copy
   Edit
   Tanlang: 1
   ID: p1
   Name: Banan
   Price: 18000
   Category: Meva
   Bunday ID mavjud!
   📷 Diagramma

   +--------------------+
   |     Product        |
   |--------------------|
   | - id: String       |
   | - name: String     |
   | - price: Double    |
   | - category: String |
   +--------------------+
   ▲
   |
   +--------------------+
   | ProductServiceImpl |
   |--------------------|
   | - products: Set    |
   +--------------------+
   Muallif: Bunyodjon Raxmonov
   📅 Sana: 2025-08-12